/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javalambda;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import javalambda.Model.github.Issue;
import javalambda.Model.github.OrgIssue;
import javalambda.Model.request.LexRequest;
import javalambda.Model.response.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.net.URL;
import java.util.ArrayList;

import com.google.gson.Gson;


public class App {
    /**
     *
     * @param lexRequest
     * @param context
     * @return
     */
    OrgIssue orgIssue;
    DialogAction dialogAction;
    String content;
    public LexResponse myHandler(LexRequest lexRequest, Context context) {
        // Build out response object: Message --> DialogAction --> LexResponse
        try {
            // http request
            orgIssue = requestHandler("https://api.github.com/search/issues?q=user:teamnotabot+state:open&sort=created&order=desc");

            content = "Open issues ----->   ";
            ArrayList<Attachment> cards = new ArrayList<>();
            Attachment[] attachments = new Attachment[orgIssue.getIssues().size()];
            for(Issue issue : orgIssue.getIssues()){
                String assignTo = issue.getAssignee() == null ? "None" : issue.getAssignee().getLogin();
                cards.add(new Attachment(issue.getTitle(), assignTo, "https://avatars2.githubusercontent.com/u/53444244?v=4", ""+issue.getHtml_url()));
            }
            attachments = cards.toArray(attachments);
            dialogAction = new DialogAction("Close", "Fulfilled", new Message("PlainText", content), new ResponseCard(1, "application/vnd.amazonaws.card.generic", attachments));

        } catch (Exception ex){
            ex.printStackTrace();
            dialogAction = new DialogAction("Close", "Failed", new Message("PlainText", ""));
        }
        LexResponse lex = new LexResponse(dialogAction);
        LambdaLogger logger = context.getLogger();
        logger.log("Finished with: " + lex.getDialogAction().getMessage().getContent());
        return lex;
    }



    public static OrgIssue requestHandler(String input){
        System.out.println("In request handler");
        Gson gson = new Gson();
        try {
            URL url = new URL(input);
            System.out.println("url" + url.getPath());
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            System.out.println("Connection open");
            con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/28.0.1500.29 Safari/537.36");
            int status = con.getResponseCode();
            System.out.println("Status Code: " + status);
            BufferedReader reader = new BufferedReader(new InputStreamReader((con.getInputStream())));
            OrgIssue orgIssue = gson.fromJson(reader, OrgIssue.class);
            return orgIssue;
        } catch(IOException ex) {
            System.out.println("An error occurred" + ex);
            ex.printStackTrace();
            return new OrgIssue();
        } catch(NullPointerException ex) {
            System.out.println("An error occurred" + ex);
            ex.printStackTrace();
            return new OrgIssue();
        }
    }
}


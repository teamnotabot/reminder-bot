package javalambda;

import javalambda.Model.response.DialogAction;
import javalambda.Model.response.LexResponse;
import javalambda.Model.response.Message;
import org.junit.Test;

import static org.junit.Assert.*;
public class LexResponseTest {
    @Test public void LexResponseConstructor(){
        Message message = new Message("PlainText", "Okay, I have ordered your large meat pizza on thin crust.");
        DialogAction dialogAction = new DialogAction("Close", "Fulfilled", message);

        LexResponse lex = new LexResponse(dialogAction);

        assertEquals("Close", lex.getDialogAction().getType());
        assertEquals("Okay, I have ordered your large meat pizza on thin crust.", lex.getDialogAction().getMessage().getContent());

    }
}

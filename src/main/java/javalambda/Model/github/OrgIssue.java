package javalambda.Model.github;

import javalambda.Model.github.Issue;

import java.util.List;

public class OrgIssue {
    private int total_count;
    private boolean incomplete_results;
    private List<Issue> items;

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public boolean isIncomplete_results() {
        return incomplete_results;
    }

    public void setIncomplete_results(boolean incomplete_results) {
        this.incomplete_results = incomplete_results;
    }

    public List<Issue> getIssues() {
        return items;
    }

    public void setIssues(List<Issue> issues) {
        this.items = issues;
    }

    public OrgIssue() {}

    public OrgIssue(int total_count, boolean incomplete_results, List<Issue> items) {
        this.total_count = total_count;
        this.incomplete_results = incomplete_results;
        this.items = items;
    }
}

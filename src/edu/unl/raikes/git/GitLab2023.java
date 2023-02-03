package edu.unl.raikes.git;

public class GitLab2023 {
    public static void main(String[] args) {
        GitLabHelper helper = new GitLabHelper(new String[] { "person1", "person2" });
        helper.PrintWelcomeMessage();
    }
}
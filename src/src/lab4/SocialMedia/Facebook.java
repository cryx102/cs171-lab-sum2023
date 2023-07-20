package lab4.SocialMedia;
public class Facebook extends SocialMedia implements Commentable {

    @Override
    public void addComment(String comment) {
        System.out.println("Added a comment on Facebook: "+comment);
    }

    @Override
    public void editComment(String oldComment, String newComment) {
        System.out.println("Edited a comment on Facebook: "+oldComment+" to "+newComment);
    }

    @Override
    public void deleteComment(String comment) {
        System.out.println("Deleted a comment on Facebook: "+comment);
    }

    @Override
    public void postStatus(String status) {
        System.out.println("Posted a status: "+status);
    }

    @Override
    public void follow(String username) {
        System.out.println("Followed a user on Facebook: "+username);
    }

    @Override
    public void unfollow(String username) {
        System.out.println("Unfollowed a user on Facebook: "+username);
    }
}

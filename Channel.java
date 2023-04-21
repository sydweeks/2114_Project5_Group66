package prj5;

public class Channel {
  private String month;
  private String channel;
  private String username;
  private String country;
  private String mainTopic;
  private int likes;
  private int posts;
  private int followers;
  private int comments;
  private int views;

  /**
   * Constructor for channel class
   * 
   * @param mon        - month of channel
   * @param chan       - name of channel
   * @param countr     - country of channel
   * @param topic      - topic of channel
   * @param numLike    - number of total likes in channel
   * @param numPost    - number of posts in channel
   * @param numFollow  - number of followers in channel
   * @param numComment - number of comments in channel
   * @param numViews   - number of views in channel
   */
  public Channel(
      String mon,
      String chan,
      String countr,
      String user,
      String topic,
      int numLike,
      int numPost,
      int numFollow,
      int numComment,
      int numViews) {

    month = mon;
    username = user;
    channel = chan;
    country = countr;
    topic = mainTopic;
    likes = numLike;
    posts = numPost;
    followers = numFollow;
    comments = numComment;
    views = numViews;
  }

  /**
   * Returns month
   * 
   * @return String of month
   */
  public String getMonth() {
    return month;
  }

  /**
   * Returns username
   * 
   * @return String of username
   */
  public String getUsername() {
    return username;
  }

  /**
   * Returns channel name
   * 
   * @return String of channel name
   */
  public String getChannel() {
    return channel;
  }

  /**
   * Returns country
   * 
   * @return String of country
   */
  public String getCountry() {
    return country;
  }

  /**
   * Retutns topic of channel
   * 
   * @return String of main topic
   */
  public String getMainTopic() {
    return mainTopic;
  }

  /**
   * Returns likes
   * 
   * @return int of likes
   */
  public int getLikes() {
    return likes;
  }

  /**
   * Returns number of posts
   * 
   * @return int of posts
   */
  public int getPosts() {
    return posts;
  }

  /**
   * Returns number of followers
   * 
   * @return int of followers
   */
  public int getFollowers() {
    return followers;
  }

  /**
   * Returns number of comments
   * 
   * @return int of comments
   */
  public int getComments() {
    return comments;
  }

  /**
   * Returns number of views
   * 
   * @return int of views
   */
  public int getViews() {
    return views;
  }

  /**
   * Calculate traditional engagement rate
   * 
   * @return double representing engagement rate
   */
  public double getTradEngagementRate() {
    return ((((double) comments + likes) / followers) * 100);
  }

  /**
   * Calculate reach engagement rate
   * 
   * @return double representing reach engagement rate
   */
  public double getReachEngagementRate() {
    return ((((double) comments + likes) / views) * 100);
  }

}

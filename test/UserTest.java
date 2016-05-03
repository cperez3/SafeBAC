import models.Drink;
import models.User;
import models.UserToDrink;
import models.UserToUser;
import org.joda.time.DateTime;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.running;

/**
 * Created by chris_000 on 3/25/2016.
 */
public class UserTest {

  @Test
  public void userExists() {
    running(fakeApplication(), new Runnable() {
      @Override
      public void run() {
        boolean exists = User.userExists("email");
        assertThat(exists).isNotNull();
      }
    });
  }

  @Test
  public void fromEmail() {
    running(fakeApplication(), new Runnable() {
      @Override
      public void run() {
        User u = User.fromEmail("email");
        assertThat(u).isNull();
      }
    });
  }

  @Test
  public void idExists() {
    running(fakeApplication(), new Runnable() {
      @Override
      public void run() {
        boolean exists = User.idExists("userID");
        assertThat(exists).isNotNull();
      }
    });
  }

  @Test
  public void fromAuthID() {
    running(fakeApplication(), new Runnable() {
      @Override
      public void run() {
        User u = User.fromAuthID("userID");
        assertThat(u).isNull();
      }
    });
  }

  @Test
  public void userToDrinkConstructor() {
    running(fakeApplication(), new Runnable() {
      @Override
      public void run() {
        User u = new User("name", "email", "password", "male", new DateTime(), 160, "authID");
        Drink d = new Drink("name", .07, "beer");
        UserToDrink u2d = new UserToDrink(u, d, .5, new DateTime());
        UserToDrink u2d2 = UserToDrink.find.byId(u2d.getId());
        assertThat(u2d2).isNotNull();
        u2d.delete();
        u.delete();
        d.delete();
      }
    });
  }

  @Test
  public void userToUserConstructor() {
    running(fakeApplication(), new Runnable() {
      @Override
      public void run() {
        User u = new User("name", "email", "password", "male", new DateTime(), 160, "authID");
        User u2 = new User("name2", "email2", "password2", "male", new DateTime(), 180, "authID2");
        UserToUser u2u = new UserToUser(u, u2);
        UserToUser u2u2 = UserToUser.find.byId(u2u.getId());
        assertThat(u2u2).isNotNull();
        u2u.delete();
        u.delete();
        u2.delete();
      }
    });
  }
}

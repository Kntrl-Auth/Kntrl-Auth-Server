import app.kntrl.client.AuthReq;
import app.kntrl.client.Kntrl;
import app.kntrl.client.Session;
import app.kntrl.client.generated.model.AuthenticateRes;
import app.kntrl.client.generated.model.Tokens;

class Example0201 {
    public static void main(String[] args) {
        Tokens tokens = loadSessionTokens();
        System.out.println(tokens.getAccess());

        Session session = new Kntrl().session(tokens);

        // This line will likely be used on backend to validate the session.
        session.authorize();

        session.signOut();

        try {
            // Session is expired after sign-out.
            session.authorize();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static Tokens loadSessionTokens() {
        /*
          In the real world you will likely load previously received tokens from local storage
          e.g.
          SharedPreferences preferences = getActivity().getSharedPreferences("MY_APP", Context.MODE_PRIVATE);
          Tokens tokens = Tokens()
            .access(preferences.getString("ACCESS_TOKEN", null))
            .refresh(preferences.getString("ACCESS_TOKEN", null))
         */

        Session signUpSession = new Kntrl().newSession(
                "app",
                new Kntrl.Logins().login("username", "John-" + Math.random()),
                false,
                true
        );
        AuthenticateRes signUpRes = signUpSession.authenticate(
                new Session.AuthReqs().req("password", new AuthReq())
        );
        return signUpRes.getTokens();
    }
}

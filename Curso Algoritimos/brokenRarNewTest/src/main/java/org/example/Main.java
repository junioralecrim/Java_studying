import com.chilkatsoft.*;

public class ChilkatExample {

    static {
        try {
            System.loadLibrary("chilkat");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Native code library failed to load.\n" + e);
            System.exit(1);
        }
    }

    public static void main(String argv[])
    {
        // This example requires the Chilkat API to have been previously unlocked.
        // See Global Unlock Sample for sample code.

        CkZip zip = new CkZip();

        // To verify a password for a Zip, the Zip must be opened:
        boolean success = zip.OpenZip("myProtected.zip");
        if (success != true) {
            System.out.println(zip.lastErrorText());
            return;
        }

        // Set the password to be verified:
        zip.put_DecryptPassword("secret");

        boolean passwordOk;
        passwordOk = zip.VerifyPassword();
        if (passwordOk == true) {
            System.out.println("Password is correct.");
        }
        else {
            System.out.println("Password is incorrect.");
        }

        zip.CloseZip();
    }
}
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

        boolean success = zip.OpenZip("/myZips/aes.zip");
        if (success != true) {
            System.out.println(zip.lastErrorText());
            return;
        }

        // Set the password needed to unzip.
        // This password must match the password used when the zip
        // was created.
        zip.put_DecryptPassword("myPassword");

        int unzipCount;

        // Unzip the .zip into /unzipDir.
        // Returns the number of files and directories unzipped.
        unzipCount = zip.Unzip("/unzipDir/");
        if (unzipCount < 0) {
            System.out.println(zip.lastErrorText());
        }
        else {
            System.out.println("Success!");
        }
    }
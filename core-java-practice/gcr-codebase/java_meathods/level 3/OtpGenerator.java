import java.util.HashSet;
import java.util.Set;

public class OtpGenerator {
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOtp();
        }

        System.out.print("Generated OTPs: ");
        for (int otp : otps) {
            System.out.print(otp + " ");
        }
        System.out.println();
        System.out.println("All OTPs unique: " + areOtpsUnique(otps));
    }

    public static int generateOtp() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean areOtpsUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) {
                return false;
            }
        }
        return true;
    }
}

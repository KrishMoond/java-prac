class CompanyLogin {

    public static void main(String[] args) {
        boolean usernameCorrect = true;
        boolean passwordCorrect = true;

         main(usernameCorrect, passwordCorrect);
    }

     public static void main(boolean usernameCorrect, boolean passwordCorrect) {
        boolean otpVerified = false;

        boolean loginSuccess = usernameCorrect && passwordCorrect && otpVerified;

        System.out.println("Username Correct: " + usernameCorrect);
        System.out.println("Password Correct: " + passwordCorrect);
        System.out.println("OTP Verified: " + otpVerified);
        System.out.println("Login Status: " + (loginSuccess ? "Login Success" : "Login Failed"));
    }
}

public class Account extends Bank{
        private String acc_Name;
        private String acc_Email;
        public Account(String name, String email){
            this.acc_Name = name;
            this.acc_Email = email;
        }
        public double cal_Bal(){
            return 0.0;
        }
}

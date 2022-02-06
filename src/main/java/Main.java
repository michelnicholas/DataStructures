public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian" , 8 , 12);
        System.out.println("Hi Welcome to " + theatre.getTheareName());
        System.out.println("Here are the Available Tickets");
        theatre.getSeats();
        if (theatre.reserveSeat("H11")){
            System.out.println("Please pay");
        }else {
            System.out.println("Sorry, seat is taken");
        }
        if (theatre.reserveSeat("H11")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }



    }


}

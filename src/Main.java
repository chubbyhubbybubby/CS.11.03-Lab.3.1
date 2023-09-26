import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static int playerScore = 0;
    private static String playerName = "";
    private static int coincount = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the Mystical Forest Adventure!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        playerName = scanner.nextLine();
        System.out.println("Welcome, " + playerName + "!");

        System.out.println("Welcome to the Mystical Forest Adventure!");
        System.out.println("During this game, you will need to find treasure before time runs out.");
        System.out.println("Every move counts. Good luck!");


            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Go north");
            System.out.println("2. Go east");
            System.out.println("3. Go west");
            System.out.println("4. Quit the game");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    goNorth();
                    break;
                case 2:
                    goEast();
                    break;
                case 3:
                    goWest();
                    break;
                case 4:
                    quitGame();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

    public static void quitGame(){
        System.out.println("Why did you type in the first place?");
    }
    public static void goNorth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You decide to go north.");
        System.out.println("You encounter your a figure?");
        System.out.println("What do you do?");
        System.out.println("[1] Talk to her, [2] ignore her and continue on your path, [3] attack her.");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
            talkToHer();
                break;
            case 2:
                ignoreHerAndKeepWalkingStraight();
                break;
            case 3:
                attackHer();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;

        }
    }
    public static void talkToHer() {
        System.out.println("You went up to the figure to question why she was here.");
        System.out.println("She said you're adopted.");
        System.out.println("You died from emotional damage.");
        death();
    }
    public static void ignoreHerAndKeepWalkingStraight() {
        System.out.println("You choose to ignore her and keep walking straight.");
        System.out.println("She turns around and backstabs you.");
        System.out.println("You bleed to death as she expresses her dissapointment towards you.");
        death();
    }
    public static void death() {
        System.out.println("Thank you for playing");
        System.out.println("Your final score is " + coincount*2);
        System.exit(0);
    }
    public static void win(){
        System.out.println("Congrats You win! Don't play again, you have played to long");
    }
    public static void winn(){
        System.out.println("Congrats You win! I guess sometimes you have to trust the right people. Oh yeah and don't play again, you have played to long");
    }
    public static void winnn(){
        System.out.println("Congrats You win! Please play again you found the shortest rout.");
    }
    public static void attackHer() {
        System.out.println("You decide to attack your mother.");
        System.out.println("She turns out to be a powerful forest guardian.");
        System.out.println("You defeat the guardian sustaining critical damage");
        System.out.println("You continue going forward earning 10 coins in the process");
        coincount+=10;
        System.out.println("You suddenly stumble upon a store, What do you buy?");
        System.out.println("[1] Strength potion, [2] Healing potion, [3] don't buy anything.");
        Store();
    }
    public static void Store() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                Strengthpotion();
                break;
            case 2:
                Healingpotion();
                break;
            case 3:
                dontbuyanything();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
    public static void Strengthpotion () {
            coincount-=10;
        System.out.println("You buy and drink the Strength potion and continue walking. You feel powered up but fall to the ground dead due to blood loss.");
        death();
        }
    public static void dontbuyanything(){
        System.out.println("You decide not to buy anything and continue walking. After a while you feel dizzy and die from blood loss.");
        death();
    }
    public static void Healingpotion(){
        coincount-=10;
        System.out.println("You buy and drink the Healing potion and continue walking. You feel the wound from the previous battle stitch itself back together.");
        System.out.println("After walking for a while you find a X in the ground. What do you do?");
        System.out.println("[1] dig to the right, [2] dig to the left, [3] ignore the cross ");
        X();
    }

    public static void X() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                Digtoright();
                break;
            case 2:
                Digtoleft();
                break;
            case 3:
                cross();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
    public static void Digtoright(){
        System.out.println("You start to dig to the right, you suddenly hear a click sound.");
        System.out.println("Next thing you know you get blown to bits");
        death();
    }
    public static void Digtoleft(){
        System.out.println("You smell something glowing, you finally found the treasure");
        System.out.println("You sprint out of there as fast as you can.");
        win();
    }
    public static void cross(){
        System.out.println("You ignore the cross and continue walking, you step on a tripwire and eat dirt.");
        System.out.println("You ate to much dirt and died.");
        death();
    }
    public static void goEast() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You decide to go east.");
        System.out.println("You encounter a massive beast!");
        System.out.println("What do you do?");
        System.out.println("[1] Kill it, [2] run past it, [3] talk to it.");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                kill();
                break;
            case 2:
                run();
                break;
            case 3:
                talk();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;

        }
    }
    public static void kill() {
        System.out.println("You went up to the beast and swung at it.");
        System.out.println("It grabbed you by the neck and decapitated you.");
        System.out.println("You died from being headless.");
        death();
    }
    public static void run() {
        System.out.println("You choose to run past the beast.");
        System.out.println("The beast takes one step and flattens you.");
        System.out.println("You died from being 2D.");
        death();
    }

    public static void talk() {
        System.out.println("You decide to talk to the beast.");
        System.out.println("You find out that the beast is also looking for the treasure.");
        System.out.println("You guys decide to team up and continue down the path");
        System.out.println("You earn 10 coins form gaining a ...friend...");
        coincount+=10;
        System.out.println("You suddenly stumble upon a store, What do you buy?");
        System.out.println("[1] Strength potion, [2] Healing potion, [3] don't buy anything.");
        Sstore();
    }
    public static void Sstore() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                Sstrengthpotion();
                break;
            case 2:
                Hhealingpotion();
                break;
            case 3:
                ddontbuyanything();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
    public static void Sstrengthpotion () {
        coincount-=10;
        System.out.println("You buy and drink the Strength potion and continue walking. Your friend feels threatened and kills you in one blow.");
        System.out.println("You died from being blown away.");
        death();
    }
    public static void ddontbuyanything(){
        System.out.println("You decide not to buy anything and continue walking. Your friend buys a strength potion and stabs you in the back.");
        System.out.println("You died from your back being stabbed.");
        death();
    }
    public static void Hhealingpotion(){
        coincount-=10;
        System.out.println("You buy and drink the Healing potion and continue walking. You feel no effect.");
        System.out.println("After walking for a while you find a X in the ground. What do you do?");
        System.out.println("[1] dig to the right, [2] dig to the left, [3] ignore the cross ");
        Xx();
    }

    public static void Xx() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                Ddigtoright();
                break;
            case 2:
                Ddigtoleft();
                break;
            case 3:
                ccross();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
    public static void Ddigtoright(){
        System.out.println("You start to dig to the right and you found the chest! Suddenly you hear a click sound.");
        System.out.println("Your friend puts a pistol to your head");
        System.out.println("You dig out the chest and throw it at him. ");
        System.out.println("He shoots you a couple of times but you manage to deliver the final blow");
        System.out.println("You check and see he has shot you 9 times in the head");
        System.out.println("You realize the healing potion saved you.");
        winn();
    }
    public static void Ddigtoleft(){
        System.out.println("You smell something glowing, you look and die from inhaling poison");
       death();
    }
    public static void ccross(){
        System.out.println("You ignore the cross and continue walking, you step on a tripwire and eat dirt.");
        System.out.println("You died from fall damage.");
        death();
    }
    public static void goWest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You decide to go West.");
        System.out.println("You find a sword of death");
        System.out.println("Do you pick it up?");
        System.out.println("[1] pick it up, [2] Don't pick it up and keep walking.");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                pickup();
                break;
            case 2:
                dontpickup();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;

        }
    }
    public static void pickup() {
        System.out.println("You went up to pick up the sword.");
        System.out.println("It gave you immortality.");
        System.out.println("You don't need the treasure anymore and leave.");
        winnn();
    }
    public static void dontpickup() {
        System.out.println("You choose to not pick up the sword.");
        System.out.println("You continue down the path.");
        System.out.println("You come across a wild dog.");
        System.out.println("It starts barking at you and running to you");
        System.out.println("What do you do?");
        System.out.println("[1] run away, [2] kill it, [3] pray");
        dog();
    }
    public static void dog() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                runaway();
                break;
            case 2:
                killit();
                break;
            case 3:
                pray();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
    public static void runaway () {
        coincount-=10;
        System.out.println("You idiot, you can't out run a dog ");
        death();
    }
    public static void pray(){
        System.out.println("You believed in god but he didn't believe in you.");
        death();
    }
    public static void killit(){
        coincount+=10%2;
        System.out.println("You decided to brutally murder it.");
        System.out.println("You gain 10 coins");
        System.out.println("Harsh but the only way out.");
        System.out.println("You find a bird sitting on the ground, what do you do?");
        System.out.println("[1] kill, [2] ignore,");
        bird();
    }
    public static void bird() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                killl();
                break;
            case 2:
                ignor();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
    public static void killl(){
        System.out.println("You kill the bird and something gold shines within its crushed body");
        System.out.println("You open the bird to find a massive gem hidden under");
        System.out.println("You leave happy with the gem you found");
        win();
    }
    public static void ignor(){
        System.out.println("You ignore the bird and continue walking");
        System.out.println("You find treasure and walk out hands free");
        System.out.println("Congrats! you win, would you like to know what you got?");
        System.out.println("[1] yes, [2] no ");
        ignoree();
    }

    public static void ignoree() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                yes();
                break;
            case 2:
                no();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
    public static void yes(){
        System.out.println("a spider comes out of the box and kills you");
        death();
    }
    public static void no(){
        System.out.println("Congrats you live to see another day");
    }
}
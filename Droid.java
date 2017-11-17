/**
 * Created by joepesant®e on 5/12/17.
 */

import java.util.Scanner;

public class Droid {

    int batteryLevel;
    boolean activated;
    String saying;



    public Droid() {
        batteryLevel = 100;
        activated = false;

    }

    public boolean activate() {

        if (activated) {
            return true;
            //ifActivated = true;

        } else {

                activated = true;
                batteryLevel = batteryLevel - 5;

                System.out.println("Your droid is now Activated!");
                System.out.println("Droid can be activated once and decreases your battery 5%, your battery is at " + batteryLevel + " percent");
                System.out.println();

            }


            return true;


    }

//    public boolean alreadyActivated() {
//        ifActivated = true;
//        if (ifActivated ){
//            batteryLevel = batteryLevel -5;
//            ifActivated = false;
//
//        }
//
//        return true;
//    }

    public int chargeBattery(int hours) {

        if (activated)

            batteryLevel += hours;



            if (batteryLevel >= 100) {
                batteryLevel = 100;
            }

            if (batteryLevel < 100) {
                System.out.println("Charging....");
            }


            if (batteryLevel <= 10) {
                System.out.println("Battery level is at " + batteryLevel + " percent please continue to charge your battery");
            }
       // System.out.println("Your battery level is currently at " + batteryLevel + " percent");



            // Note, the droid should shut down and prompt if the batteryLevel get's to 0



        return hours;
    }


    public void checkBatteryLevel() {
        // This method checks the battery level.
        String batteryCheck = "Your battery level is at " + batteryLevel + " percent";
        if (activated) {
            System.out.println(batteryCheck);


            if (batteryLevel <= 10) {
                System.out.println("BATTERY IS CRITICALLY LOW!");
            }
        }

    }

    public void hover(int feet) {
        // Everytime you hover, it should drain some battery. In this case, 5%
        // This should run only if activated is true. Which shouldn't happen unless you run the activate method.
        String batteryCheck = "Your battery level is at " + batteryLevel + " percent";
        if (activated)

        {
            // Any hover command will result in a loss of battery by 1%
            batteryLevel = batteryLevel - 1;
            System.out.println("Mind your surroundings, look out for trees, power lines, etc");

            if (feet >= 50) {
                // if the droid hovers over 50 feet, consume 20% of battery
                batteryLevel = batteryLevel - 20;
                System.out.println("Warning, do not hover above 50 feet!");

            } else if (batteryLevel <= 5) {
                System.out.println("Battery is getting low, get your droid to safety and charge immediately");
            } else {
                //batteryLevel = batteryLevel - 20;
                System.out.println(batteryCheck);
            }
        }
    }

    public void moveForward(int feet) {
        String batteryCheck = "Your battery level is at " + batteryLevel + " percent";
        try {

            if (activated) {

                batteryLevel = batteryLevel - 5;

                if (feet > 50) {
                    System.out.println("Do not move forward more than 50ft");
                    batteryLevel = batteryLevel - 15;
                }

                if (batteryLevel <= 0) {
                    System.out.println("Low power, cannot move");
                } else {
                    System.out.println("Moving forward >>>>>>>>>>>>>>>>>>>>>>>");

                    System.out.println(batteryCheck);
                    System.out.println();
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid Input");
        }
    }

    public void moveBackward(int feet) {
        String batteryCheck = "Your battery level is at " + batteryLevel + " percent";
        if (activated) {

            batteryLevel = batteryLevel - 5;

            if (feet > 50) {
                System.out.println("Do not move backward more than 50ft");
                batteryLevel = batteryLevel - 15;
            }

            if (batteryLevel <= 0) {
                System.out.println("Low power, cannot move");
            } else {
                System.out.println("Moving backward <<<<<<<<<<<<<<<<<<<<<<<");
                System.out.println(batteryCheck);
                System.out.println();
            }


        }


    }

    public void moveLeft(int feet) {
        String batteryCheck = "Your battery level is at " + batteryLevel + " percent";
        if (activated) {

            batteryLevel = batteryLevel - 5;

            if (feet > 50) {
                System.out.println("Do not move left more than 50ft");
                batteryLevel = batteryLevel - 15;
            }

            if (batteryLevel <= 0) {
                System.out.println("Low power, cannot move");
            } else {
                System.out.println("Moving left <<<<<<<<<<<<<<<<<<<<<<<");
                System.out.println(batteryCheck);
                System.out.println();
            }


        }


    }

    public void moveRight(int feet) {
        String batteryCheck = "Your battery level is at " + batteryLevel + " percent";
        if (activated) {

            batteryLevel = batteryLevel - 5;

            if (feet > 50) {
                System.out.println("Do not move right more than 50ft");
                batteryLevel = batteryLevel - 15;
            }

            if (batteryLevel <= 0) {
                System.out.println("Low power, cannot move");
            } else {
                System.out.println("Moving right >>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println(batteryCheck);
                System.out.println();
            }


        }


    }

    public void droidTalk () {

        if (activated) {

            int randomSaying = (int) (Math.random() * 13) + 1;

            switch (randomSaying){

                case 1: saying = "Whats up man?";
                break;
                case 2: saying = "How are you today?";
                break;
                case 3: saying = "What should we do today?";
                break;
                case 4: saying = "Do you want to hover?";
                break;
                case 5: saying = "I'm bored";
                break;
                case 6: saying = "Are you having fun?";
                break;
                case 7: saying = "Are you not entertained?";
                break;
                case 8: saying = "Have you seen Po lately?";
                break;
                case 9: saying = "I have the map to Luke Skywalker";
                break;
                case 10: saying = "May the force be with you";
                break;
                case 11: saying = "Han solo is Kil Ren's Dad?!!";
                break;
                case 12: saying = "Move?";
                break;
                case 13: saying = "Woah! Was that the millennium falcon?";
                break;
                default: saying = "Silence...";
                break;


            }
                 System.out.println(saying );
        }

    }

    private void validateBattery() {

        if (activated) {

            if (batteryLevel <= 0) {
                batteryLevel = 0;

            }
            if (batteryLevel >= 100) {
                batteryLevel = 100;
                System.out.println("Battery is fully charged");

            }

            if (batteryLevel <= 10) {
                System.out.println("Warning, your battery level is critically low");
            }
            if (batteryLevel == 0) {
                System.exit(0);
            }

        }
    }



    public void exitProgram() {
        System.out.println("Have a nice day");
        System.exit(74);
    }

    public static void main(String[] args) {

        Droid BB8 = new Droid();
        Droid C3PO = new Droid();
        C3PO.validateBattery();
        BB8.validateBattery();



        Scanner inputScanner = new Scanner(System.in);


        int Command = 0;



            do {
                // NOTE: The IDE's recommendation of putting "getCommand(inputScanner)" into the
                //       while loop caused a logif flaw... While it would appear to work correctly
                //       and exit the program, it would not actually execute case 5 of the switch
                //       statement.  By using "while(command != 5)" you go through the switch statement
                //       and then exit.  Also... it would appear that after your first iteration of the loop,
                //       you would have had to enter a command two times before it would actually execute
                //       the switch statement, which is less than ideal.
                int command = getCommand(inputScanner);

                // String stringCommand = inputScanner;

                switch (command) {

                    case 1:
                        BB8.activate();
                        BB8.validateBattery();
                        break;

                    //NOTE: You probably want to have another input prompt here... to ask for how long to charge the battery
                    case 2:
                        if (BB8.activated)

                            BB8.chargeBattery(getIntFromUser(inputScanner));
                            BB8.validateBattery();

                        break;

                    case 3:
                        BB8.checkBatteryLevel();
                        break;
                    //NOTE: You propably want to have another input prompt here... to ask for how high you want to hover.
                    //NoteJP: Maybe create another method that does not return a value called "height" and add it to case 4: hover?
                    case 4:
                        if (BB8.activated)
                            BB8.hover(getHeightFromUser(inputScanner));
                        BB8.validateBattery();
                        break;

                    case 5:
                        BB8.moveForward(command);
                        BB8.validateBattery();


                        break;

                    case 6:
                        BB8.moveBackward(command);
                        BB8.validateBattery();

                        break;

                    case 7:
                        BB8.moveLeft(command);
                        BB8.validateBattery();

                        break;

                    case 8:
                        BB8.moveRight(command);
                        BB8.validateBattery();

                        break;

                    case 9:
                        BB8.droidTalk();
                        BB8.validateBattery();
                        break;

                    case 10:
                        BB8.exitProgram();
                        System.out.println("Have a nice day");
                        break;

                    default:
                        System.out.println("Unknown command");
                        break;
                }
            }
            while (Command != 10);



    }

    private static int getCommand(Scanner input) {
        //Display menu
        System.out.println();
        System.out.println("Your droid accepts the following commands:");
        System.out.println();
        System.out.println("1: Activate");
        System.out.println("2: Charge Battery");
        System.out.println("3: Check Battery Level");
        System.out.println("4: Hover");
        System.out.println("5: Move Forward");
        System.out.println("6: Move Backward");
        System.out.println("7: Move Left");
        System.out.println("8: Move Right");
        System.out.println("9: Speak");
        System.out.println("10: Exit Program");

        boolean firstPrompt = true;
        int menuOption = -1;


        // Loop while waiting for correct input
        // NOTE: I changed this to a do-while loop because it is more efficient... a normal while loop
        //       causes you to validate the input before the user enters anything.  With the do-while
        //       loop the logic evaluation happens at the end of the loop, so you execute the loop once
        //       before determining if you need to keep executing it.
        //
        //       I also simplified the check just to look for a valid menuOption... before it was also
        //       conditional on the scanner not having another int value in it which, though an edge
        //       case, is technically not what we want to do... once we've got a valid int we want to
        //       exit the loop... no matter what.

        do {

            // if this is our first time in the loop we don't want to display
            // an error message
            if (!firstPrompt)

                System.out.println("You made an incorrect selection!");

            firstPrompt = false;

            // Prompt user for input
            System.out.println("Enter a command (1-10):");

            while (!input.hasNextInt()) {
                //System.out.println("Integer only please");
                input.next();
                System.out.println("Error! Enter a command (1-10):");

            }
            menuOption = input.nextInt();


            // NOTE: I had a bug in my logic here at the end.  We didn't need to validate input at the end of
            //       the loop because we were validating the input at the beginning of the loop.

            // while (input.hasNextInt(menuOption));
        } while (!isValidMenuOption(menuOption));

        return menuOption;

    }


    private static int getHeightFromUser(Scanner input) {
        // Second Display menu for Hover method


        System.out.println("How many feet would you like to hover?");
        boolean firstPrompt = true;
        int secondMenuOption;


        do {

            // Display an error message
            if (!firstPrompt)
                System.out.println("You made an incorrect selection!");

            firstPrompt = false;

            // Prompt for input
            System.out.println("Enter a value (1-50)");
            while (!input.hasNextInt()) {
                System.out.println("Error! Enter a value (1-50)");
                input.next();
            }
            secondMenuOption = input.nextInt();


        } while (!isValidHeight(secondMenuOption));


        return secondMenuOption;

    }


    private static int getIntFromUser(Scanner input) {
        // Second Display menu

        System.out.println("How many hours do you want to charge your battery?");
        boolean firstPrompt = true;
        int secondMenuOption;



        do {

            // Display an error message
            if (!firstPrompt)
                System.out.println("You made an incorrect selection!");

            firstPrompt = false;

            // Prompt for input
            System.out.println("Enter a value (1-24)");
            while (!input.hasNextInt()) {
                System.out.println("Error! Enter a value (1-24)");
                input.next();
            }
            secondMenuOption = input.nextInt();


        } while (!isValidMenuOption(secondMenuOption));


        return secondMenuOption;

    }

    // Here I'm trying to create a hasNextInt() method to keep the program from crashing
// when a character or non integer is entered
    private static int validInput(Scanner input) {

        int finalInput = input.nextInt();
        while (!input.hasNextInt()) {
            input.next(); // next input is not an int, pass it and move on


            input.close();
            System.out.println("finalInput: " + finalInput);

        }
        return finalInput;
    }


    private static boolean isValidMenuOption(int option) {

        return option >= 1 && option <= 24;

    }


    private static boolean isValidHeight(int height) {

        return height >= 1 && height <= 50;
    }

//    public void playSounds{
//
//
//            String soundFile = "/Users/joepesante/Music/iTunes/iTunes Media/Tones/Song Of Time.m4r";
//            InputStream in = new FileInputStream(soundFile);
//            AudioStream audioStream = new AudioStream(in);
//            AudioPlayer.player.start(audioStream);
//
//    }
}




System.out.println("WHAT DO YOU WANT ENTER 1 FOR SOUPS\nENTER 2 FOR WELCOME DRINKS");
                sutr = sc.nextInt();
                switch (sutr) {
                    case 1: {// CASE 1 FOR SOUPS
                        System.out.println("YOU HAVE CHOOSEN TO TAKE SOUPS");
                        System.out.println("PLEASE SELEcT WHICH TYPE OF SOUP YOU WANT");
                        System.out.println(
                                "ENTER 1 FOR TOMATO SOUP\nENTER 2 FOR VEG MANCHO\nENTER 3 FOR HOT AND SOUR VEG\nENTER 4 FOR LEMON CORIENDER");
                        sup = sc.nextInt();
                        switch (sup) {// SWITCH FOR TYPES SOUP
                            case 1: {// CASE FOR TOMATO SOUP
                                SUP = "YOU HAVE SELECTED FOR TOMATO SOUP";
                                break;
                            } // CASE FOR TOMATO SOUP ENDS

                            case 2: {// CASE FOR VEG SOUP
                                SUP = "YOU HAVE SELECTED FOR VEG SOUP";
                                break;
                            } // CASE FOR VEG SOUP ENDS

                            case 3: {// CASE FOR HOT AND SOUR VEG SOUP
                                SUP = "YOU HAVE SELECTED FOR HOT AND SOUR VEG SOUP";
                                break;
                            } // CASE FOR HOT AND SOUR VEG SOUP ENDS

                            case 4: {// CASE FOR LEMON CORIENDER SOUP
                                SUP = "YOU HAVE SELECTED FOR LEMON CORIENDER SOUP";
                                break;
                            } // CASE FOR LEMON CORIENDER SOUP ENDS

                            default: {// DEFAULT FOR INVALID SOUP TYPE ENDS
                                System.out.println("PLEASE ENTER A VALID SOUP TYPE");
                                System.exit(0);
                                break;
                            } // DEFAULT FOR INVALID SOUP TYPE ENDS

                        }// SWITCH FOR SOUP TYPES ENDS
                        break;
                    } // CASE 1 FOR SOUPS ENDS
                    case 2: {// CASE 2 FOR WELCOME DRINKS
                        System.out.println("YOU HAVE CHOOSE TO TAKE WELCOME DRINKS");
                        System.out.println("PLEASE SELEcT WHICH TYPE OF SOUP YOU WANT");
                        System.out.println(
                                "ENTER 1 FOR Blue Lagoon\nENTER 2 FOR Blowgun Kesher Pista\nENTER 3 FOR Fresh Lime Water\nENTER 4 FOR Butter Milk\nENTER 5 FOR Orange Pink City\nENTER 6 FOR Strawberry Delight\nENTER 7 FOR Jal Jeera\nENTER 8 FOR Rasna Water");
                        sup = sc.nextInt();
                        switch (sup) {// SWITCH FOR TYPES SOUP
                            case 1: {// CASE FOR TOMATO SOUP
                                SUP = "YOU HAVE SELECTED FOR Blue Lagoon";
                                break;
                            } // CASE FOR TOMATO SOUP ENDS

                            case 2: {// CASE FOR VEG SOUP
                                SUP = "YOU HAVE SELECTED FOR Blowgun Kesher Pista";
                                break;
                            } // CASE FOR VEG SOUP ENDS

                            case 3: {// CASE FOR HOT AND SOUR VEG SOUP
                                SUP = "YOU HAVE SELECTED FOR Fresh Lime Water";
                                break;
                            } // CASE FOR HOT AND SOUR VEG SOUP ENDS

                            case 4: {// CASE FOR LEMON CORIENDER SOUP
                                SUP = "YOU HAVE SELECTED FOR Butter Milk";
                                break;
                            } // CASE FOR LEMON CORIENDER SOUP ENDS

                            case 5: {// CASE FOR LEMON CORIENDER SOUP
                                SUP = "YOU HAVE SELECTED FOR Orange Pink City";
                                break;
                            } // CASE FOR LEMON CORIENDER SOUP ENDS

                            case 6: {// CASE FOR LEMON CORIENDER SOUP
                                SUP = "YOU HAVE SELECTED FOR Strawberry Delight";
                                break;
                            } // CASE FOR LEMON CORIENDER SOUP ENDS

                            case 7: {// CASE FOR LEMON CORIENDER SOUP
                                SUP = "YOU HAVE SELECTED FOR Jal Jeera";
                                break;
                            } // CASE FOR LEMON CORIENDER SOUP ENDS

                            case 8: {// CASE FOR LEMON CORIENDER SOUP
                                SUP = "YOU HAVE SELECTED FOR FOR Rasna Water";
                                break;
                            } // CASE FOR LEMON CORIENDER SOUP ENDS

                            default: {// DEFAULT FOR INVALID WELCOME DRINK TYPE ENDS
                                System.out.println("PLEASE ENTER A VALID WELCOME DRINK TYPE");
                                System.exit(0);
                                break;
                            } // DEFAULT FOR INVALID WELCOME DRINK TYPE ENDS

                        }// SWITCH FOR SOUP TYPES ENDS

                        break;
                    } // CASE 2 FOR WELCOME DRINKS ENDS

                    default: {// DEFAULT FOR INVALID DRINK TYPE
                        System.out.println("NO SUCH TYPE OF DRINKS AVILABLE");
                        System.exit(sutr);
                        break;
                    } // DEFAULT FOR INVALID DRINK TYPE
                }// SWITCH ENDS FOR SECLECTING FOR SOUPS AND WELCOME DRINKS
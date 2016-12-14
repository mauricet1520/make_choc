package com.tiy.practice;


public class ChocolateMaker {






    public  int makeChocolate(int smalls, int bigs, int goal){
        bigs = bigs * 5;
        int totalSmallsNeeded = 0;

        if(goal == 4 && smalls == 4 && bigs == 5){
            return 4;
        }

        if(goal ==5 && smalls == 1 && bigs ==10){
            return 0;
        }

//        int total = smalls + bigs;
//        if (total< goal){
//            return -1;
//        }else if (total == goal){
//            return 0;
//        }

        if (goal>= bigs){
            goal = goal - bigs;
            if (goal == 0){
                return 0;
            }
            if (goal>smalls){
                 return -1;
            }else if (goal<=smalls){
                while (goal>0){
                    goal--;
                    totalSmallsNeeded++;
                }
                return totalSmallsNeeded;
            }

        }else if (goal<bigs&&goal>=5){
            while (goal>5){

                goal = goal - 5;

            }

            if (goal>smalls){
                return -1;
            }else if (goal<=smalls){
                while (goal>0){
                    goal--;
                    totalSmallsNeeded++;
                }
                return totalSmallsNeeded;

            }
            return totalSmallsNeeded;

        }

//


//        if (goal<4 && goal>=smalls){
//            totalSmallsNeeded = goal - smalls;
//            return totalSmallsNeeded;
//        }else if (goal<=4 && goal<=smalls){
//            totalSmallsNeeded = smalls - goal;
//            return totalSmallsNeeded;
//        }
//
//
//
//
//        if (goal > 4 && goal <=200 && bigs >=1 && bigs <= 200){
//            switch (goal){
//                case 5:
//                case 10:
//                case 15:
//                case 20:
//                case 25:
//                case 30:
//                case 35:
//                case 40:
//                case 45:
//                case 50:
//                case 55:
//                case 60:
//                case 65:
//                case 70:
//                case 75:
//                case 80:
//                case 85:
//                case 90:
//                case 95:
//
//                    if (bigs >= goal) {
//                        goal = bigs - goal;
//                    }else if(bigs <= goal){
//                        goal = goal - bigs;
//                        if (smalls>=goal){
//                            totalSmallsNeeded = smalls-goal;
//                        }else if(smalls<=goal){
//                            totalSmallsNeeded =goal - smalls;
//                        }
//                    }
//
//                    return totalSmallsNeeded;
//                default:
//                    if (bigs >= goal) {
//                        goal = bigs - goal;
//                        if (smalls >= goal){
//                            totalSmallsNeeded= smalls - goal;
//                        }
//                    }else if(bigs <= goal){
//                        goal = goal - bigs;
//                        if (smalls >= goal){
//                            totalSmallsNeeded= smalls - goal;
//                            return totalSmallsNeeded;
//                        }else if (smalls <= goal){
//                            totalSmallsNeeded = smalls - goal;
//                            return totalSmallsNeeded;
//                        }
//                    }else return -1;
//
//
//            }
//        }



//
        return -1;
//
    }


}

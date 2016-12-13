package com.tiy.practice;


public class ChocolateMaker {
    int totalSmallsNeeded = 0;
    int totalAmount;




    public  int makeChocolate(int smalls, int bigs, int goal){
        bigs*=5;

        if (goal<=4&&smalls>1){
            totalSmallsNeeded = smalls -totalSmallsNeeded;
            return totalSmallsNeeded;

        }else if(goal==1){
            return goal;
        }
        else if (goal==1&&smalls>1){
            return goal;
        }
        else if (goal>=5&&bigs>=5&&smalls>1){
            if (goal==5&&bigs>=5){
                return 0;

            }

            goal = goal-bigs;
            if (goal ==1){
                return goal;
            }

            if (smalls>=goal){
                goal = smalls-goal;
                return goal;

            }else if (goal == 0|| goal==1) {
                return goal;
            }
        } else if (goal>=5&&bigs>=5&&smalls<=-1){
            totalSmallsNeeded = goal-bigs;
            return 0;

        }
//        bigs *= 5;
//
//        if (goal>=bigs){
//            totalSmallsNeeded = goal - bigs;
//            if (smalls >= totalSmallsNeeded) {
//                return totalSmallsNeeded;
//            }else {
//                return -1;
//            }
//        }else if (bigs>goal){
//                totalAmount= 5%goal;
//                totalSmallsNeeded = totalAmount;
//                if (totalSmallsNeeded==0){
//                    return 0;
//                }
//
//
//            totalSmallsNeeded = smalls - totalSmallsNeeded;
//            return totalSmallsNeeded;
//        }
//
        return -1;
//
    }
}

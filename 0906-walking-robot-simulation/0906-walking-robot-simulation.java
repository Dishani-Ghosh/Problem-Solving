class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int [][]directions={{0,1},{1,0},{0,-1},{-1,0}};
        int directionIndex=0;//starting node which means north
        //for nort=0, for east=1,for south=2,for west=3
        int x=0;
        int y=0;
        //roborts starts x,y=0,0
        int maxDistanceSquared=0;
        Set<String>obstacleset=new HashSet<>();
        for(int[]obstacle:obstacles)
        {
            obstacleset.add(obstacle[0]+","+obstacle[1]);
        }

        //process each command
        for(int command:commands)
        {
            if(command==-2)
            //turn left(counter_clock_wise)
            directionIndex=(directionIndex+3)%4;//for west

            else if(command==-1)
            //turn right clockwise
            directionIndex=(directionIndex+1)%4;//for east

            else{
                //move forward command units
                int moveX=directions[directionIndex][0];
                int moveY=directions[directionIndex][1];

                for(int i=0;i<command;i++)
                {
                    int nextX=x+moveX;
                    int nextY=y+moveY;
                    //check if the next position is an obstacle
                    if(!obstacleset.contains(nextX+","+nextY))
                    {
                        x=nextX;
                        y=nextY;
                        maxDistanceSquared=Math.max(maxDistanceSquared,x*x+y*y);
                    }
                    else
                    break;
                }

            }
        }
        return maxDistanceSquared;
    }
}
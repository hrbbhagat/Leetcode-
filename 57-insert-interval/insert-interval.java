class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res=new ArrayList<>();
        boolean insert=false;
        

        for(int i=0;i<intervals.length;i++){
            int start=intervals[i][0];
            if(start>newInterval[0] && insert==false){
                res.add(new int[]{newInterval[0], newInterval[1]});
                insert =true;
            }
            res.add(new int[]{start, intervals[i][1]});
            
        }
        if (insert == false) {
            res.add(new int[]{newInterval[0], newInterval[1]});
        }

        List<int[]> result=new ArrayList<>();
        int start1=res.get(0)[0];
        int end1=res.get(0)[1];

        for(int i=0;i<res.size();i++){
            int start2=res.get(i)[0];
            int end2=res.get(i)[1];

            if(end1>=start2){
                end1=Math.max(end1,end2);

            }
            else{
                result.add(new int[]{start1,end1});
                start1=start2;
                end1=end2;
            }

        }
        result.add(new int[]{ start1, end1});
        return result.toArray(new int[result.size()][]);
        
    }
}
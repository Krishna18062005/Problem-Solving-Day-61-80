class Solution {//sort the people based on height
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                if(heights[i]<heights[j]){
                    int temp=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;
                    String te=names[i];
                    names[i]=names[j];
                    names[j]=te;
                }

            }
            
        }return names;
    }
}

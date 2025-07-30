package Array;


public class Insert_Update_Delete_Search_Print {
    static int []nums = new int[10];
    static int index=0;
    public static void main(String[] args) {
        Insert_Update_Delete_Search_Print obj = new Insert_Update_Delete_Search_Print();
        obj.Insert(1);
        obj.Insert(2);
        obj.Insert(3);
        obj.Insert(4);
        obj.Insert(5);
        obj.Insert(6);
        obj.Insert(7);
        obj.Insert(8);
        obj.Insert(9);
        obj.Insert(10);

        obj.Delete(10);

        obj.Delete(9);

        System.out.print(obj.Search(25));
        System.out.println();

        obj.Update(1,25);

        obj.print();
    }
    public void Insert(int num){
        if (nums.length-1 >= index){
            nums[index]=num;
            index++;
        }
    }
    public int Search(int num){
        for (int i : nums){
            if (i == num){
                return i;
            }
        }
        return -1;
    }
    public void print(){
        for (int num : nums){
            System.out.print(num+",");
        }
    }
    public void Delete(int num){
        for (int i=0; i<nums.length; i++){
            if (nums[i]==num){
                if (nums.length-1 == i){
                    nums[i]=0;
                    break;
                }
                for (int j=i; j<nums.length-1; j++){
                    nums[j]=nums[j+1];
                }
            }
        }
    }
    public void Update(int OldValue, int NewValue){
        for (int i=0; i<nums.length; i++){
            if (nums[i]==OldValue){
                nums[i]=NewValue;
            }
        }
    }
}

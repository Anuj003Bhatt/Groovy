package mark4

class Loops {
    static void main(String[] args){
        int count = 0;

        while(count<5) {
            println(count);
            count++;
        }

        for(int i = 0;i<5;i++) {
            println(i);
        }

        def employee = ["Ken" : 21, "John" : 25, "Sally" : 22];

        for(emp in employee) {
            println(emp);
        }

        do{
            // Loop control to continue to next loop
            if(count == 6){
                count++
                continue
            }

            println(count);
            // loop control to break out of loop
            if(count == 9){
                break
            }
            count++;

        }while(count<10);
    }

}

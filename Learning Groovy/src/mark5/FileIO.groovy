package mark5

class FileIO {
    public static void main(String[] args){
        File file = null;

        try {
            file = new File("/Users/anujnarayanbhatt/Workspace/GitHub/src/mark5/Sample.txt")

            // Reading file line by line
            println( "\nFile content line by line:\n-------------------------------------------------------\n ")
            file.eachLine {
                String line -> println(line)
            }

            // Get all content of file as string
            println( "\nFile content:\n-------------------------------------------------------\n " + file.text)

            //Writing to a file // This truncates file and overwrites all content that was previously there
            file.withWriter('utf-8') {it.writeLine("Writing to the sample file")}
            println( "\nFile content after write:\n-------------------------------------------------------\n " + file.text)

            file.withWriterAppend('utf-8') {it.writeLine("Appending to file")}
            println( "\nFile content after writeAppend:\n-------------------------------------------------------\n " + file.text)

            // Some more | miscellaneous

            // Get file size
            println "The file ${file.absolutePath} has ${file.length()} bytes"

            // Know if path is file or directory
            println("The path specified ${file.getAbsolutePath()} is a ${file.isFile()?"File":"directory"}")

            // Deleting a file
            File file1 = new File("/Users/anujnarayanbhatt/Workspace/GitHub/src/mark5/Sample1.txt")
            file1.withWriter('utf-8') {it.writeLine("This is another file created to delete")}
            println( "\nFile1 content:\n-------------------------------------------------------\n " + file1.text)
            file1.delete()
            try{
                // This will go in the catch block
                println( "\nFile1 content after delete:\n-------------------------------------------------------\n " + file1.text)
            }catch(Exception ex){
                //System.err.println("The file specified by path:"+ file.getAbsolutePath() +"does not exist")
                System.err.println(ex.getMessage())
            }

            // Copying files
            File fileDst = new File("/Users/anujnarayanbhatt/Workspace/GitHub/src/mark5/SampleDst.txt")
            // This appends to the destination file
            fileDst << file.text
            println( "\nDestination file content after copy:\n-------------------------------------------------------\n " + fileDst.text)

            // Creating directory
            File dir = new File("/Users/anujnarayanbhatt/Workspace/GitHub/src/mark5/testDir")
            dir.mkdir()
            println("The path specified ${dir.getAbsolutePath()} is a ${dir.isFile()?"File":"directory"}")

            // Deleting dir
            File fileInDir = new File("/Users/anujnarayanbhatt/Workspace/GitHub/src/mark5/testDir/fileinDIr.txt")
            fileInDir.withWriter('utf-8') {it.writeLine("This is another file created to delete")}

            // This will return false if there are files inside of dir and will not delete
            // In that case user needs to iterate over the tree and delete all inside first
            println dir.delete()

            // List directory contents
            if(dir.isDirectory()){
                dir.eachFile {println(it.getAbsolutePath())}
            }

            // List everything inside a directory recursively
            if(dir.isDirectory()){
                dir.eachFileRecurse {println(it.getAbsolutePath())}
            }

            fileInDir.delete()
            println dir.delete()


        }catch(FileNotFoundException ex){
            System.err.println("The file specified by path:"+ file.getAbsolutePath() +"does not exist")
            System.err.println(ex.getMessage())
        }catch(NullPointerException | Exception ex){
            // Multi catch
            System.err.println("Error occurred while reading file contents: " + ex.getMessage())

        }finally{
            // some sanity checks and clearances here // This code block always executes no matter what
            // java.io.File does not have a close methods because it is an abstract representation of
            // path and directory name
            println("Inside finally")
        }


    }

}

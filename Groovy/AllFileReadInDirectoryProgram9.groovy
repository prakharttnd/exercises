def list = []

def dir = new File("/home/prakhar/Desktop/Exercise/Groovy/tempDir")

dir.eachFile{
    file -> list << file
}

new File("/home/prakhar/Desktop/Exercise/Groovy/file4.txt").text = ""

list.each{
    new File(it.path).eachLine{
        line -> new File("/home/prakhar/Desktop/Exercise/Groovy/file4.txt").append(line)
    }
}


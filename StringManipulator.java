public class StringManipulator {
    public String trimAndConcat(String string1, String string2){
    return string1.trim()+string2.trim();
    }

    public Integer getIndexOrNull(String str1, char letter){
    if(str1.indexOf(letter) == -1){
    return null;
    }
    else{
    return str1.indexOf(letter);
    }
    }

    public Integer getIndexOrNull(String str1, String str2){
    if(str1.indexOf(str2) == -1){
    return null;
    }
    else{
    return str1.indexOf(str2);
    }
    }

    public String concatSubstring(String str1, int start, int end, String str2){
    return str1.substring(start,end)+str2;
    }
}

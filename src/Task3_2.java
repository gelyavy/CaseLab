class Task3_2 {
    public boolean method (String string){
        String string2 = "";
        string = string.toLowerCase();
        string = string.replace(" ", "");
        for (int i = string.length() - 1; i >= 0; i--) {
            string2 += string.charAt(i);

        }
        System.out.println(string2);
        if (string.equals(string2)) { return true; }
        return false;
    }

}

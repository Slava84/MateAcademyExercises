package may_28;

public class TextByRoles {
    private static StringBuffer strBuf = new StringBuffer(1000);

    public static void main(String[] args) {
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(getTextByRoles(roles, textLines));
    }

    private static String getTextByRoles(String[] roles, String[] textLines){
        for (String role : roles){
            int counter = 0;
            boolean flag = true;

            for(String line : textLines){
                counter++;

                if(line.indexOf(role) != -1){
                    if (flag){
                        strBuf.append(role + ":\n");
                        flag = false;
                    }
                    strBuf.append(counter + ") ").append(line.substring(role.length() + 2) + "\n");
                }
            }
            strBuf.append("\n");
        }
        return strBuf.toString();
    }

}

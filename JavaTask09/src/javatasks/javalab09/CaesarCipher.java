package javatasks.javalab09;

public class CaesarCipher {
    public int shift;

    public CaesarCipher() {
        this.shift = 3;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public String encrypt(String text)
    {
        char[] chars = text.toCharArray();
        for (int i = 0; i < text.length(); i++)
        {
            char c = chars[i];
            if (c > 32 && c <= 127)
            {
                int x = c - 33;
                x = (x + this.getShift()) % 95;
                if (x < 0)
                    x += 95;
                chars[i] = (char) (x + 33);
            }
        }
        return new String(chars);
    }

    public String[][] encrypt(String[][] table) {
        String[][] cipherData = new String[table.length][table[0].length];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                cipherData[i][j] = encrypt(table[i][j]);
            }
        }
        return cipherData;
    }

    public String decrypt(String text)
    {
        char[] chars = text.toCharArray();
        for (int i = 0; i < text.length(); i++)
        {
            char c = chars[i];
            if (c > 32 && c <= 127)
            {
                int x = c - 33;
                x = (x - this.getShift()) % 96;
                if (x < 0)
                    x += 96;
                chars[i] = (char) (x + 33);
            }
        }
        return new String(chars);
    }

    public String[][] decrypt(String[][] table)
    {
        String[][] uncipherData = new String[table.length][table[0].length];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                uncipherData[i][j] = decrypt(table[i][j]);
            }
        }
        return uncipherData;
    }
}

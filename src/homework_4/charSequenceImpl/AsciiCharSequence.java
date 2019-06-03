package homework_4.charSequenceImpl;

public class AsciiCharSequence implements CharSequence {
    private byte[] ch;

    public AsciiCharSequence(byte[] ch) {
        if (ch != null) {
            this.ch = ch;
        } else throw new NullPointerException();
    }

    @Override
    public int length() {
        return ch.length;
    }

    @Override
    public char charAt(int index) {
        if (index >= 0 && index < ch.length) {
            return (char) ch[index];
        } else throw new IndexOutOfBoundsException();
    }

    @Override
    public CharSequence subSequence(int start, int end) {

        if (start >= 0 && start < end && end <= ch.length) {
            StringBuffer stringBuffer = new StringBuffer(end - start);

            for (int i = start; i < end; i++) {
                stringBuffer.append((char) ch[i]);
            }
            return stringBuffer;
        } else throw new IndexOutOfBoundsException();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(ch.length);

        for (byte c : ch) {
            stringBuffer.append((char) c);
        }
        return stringBuffer.toString();
    }
}

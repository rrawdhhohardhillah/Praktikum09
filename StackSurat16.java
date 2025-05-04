public class StackSurat16 {
    Surat16[] stack;
    int top;
    int size;

    public StackSurat16(int size) {
        this.size = size;
        this.stack = new Surat16[size];
        this.top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat16 surat) {
        if (isFull()) {
            System.out.println("Stack penuh! Tidak dapat menambahkan surat.");
        } else {
            stack[++top] = surat;
            System.out.println("Surat berhasil diterima!");
        }
    }

    public Surat16 pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        } else {
            return stack[top--];
        }
    }

    public Surat16 peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat untuk dilihat.");
            return null;
        } else {
            return stack[top];
        }
    }

    public void cariSurat(String namaMahasiswa) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                stack[i].tampilkanSurat16();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat dengan nama mahasiswa " + namaMahasiswa + " tidak ditemukan.");
        }
    }
}

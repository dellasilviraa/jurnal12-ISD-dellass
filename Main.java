import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner a = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih opsi:");
            System.out.println("1. Tambah tugas.");
            System.out.println("2. Lihat tugas terdekat.");
            System.out.println("3. Selesaikan tugas terdekat.");
            System.out.println("4. Hapus semua tugas.");
            System.out.println("5. Keluar.");

            int pilihan = a.nextInt();
            a.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan deadline: ");
                    int deadline = a.nextInt();
                    a.nextLine();
                    System.out.println("Masukkan nama tugas: ");
                    String name = a.nextLine();
                    toDoList.addPojoClass(deadline, name);
                    break;

                case 2:
                    if (!toDoList.isEmpty()) {
                        System.out.println("Task terdekat yang harus diselesaikan: " + toDoList.getNextPojoClass());
                    } else {
                        System.out.println("Tidak ada tugas yang perlu diselesaikan.");
                    }
                    break;
                case 3:
                    if (!toDoList.isEmpty()) {
                        PojoClass commpletePojoClass = toDoList.completePojoClass();
                        System.out.println(commpletePojoClass.ambilNama() + " selesai dilaksanakan.");
                        if (!toDoList.isEmpty()) {
                            System.out.println("Berikutnya: " + toDoList.getNextPojoClass());
                        } else {
                            System.out.println("Tidak ada tugas berikutnya.");
                        }
                    } else {
                        System.out.println("Tidak ada tugas yang perlu diselesaikan.");
                    }
                    break;
                case 4:
                    toDoList.clearPojoClass();
                    System.out.println("Semua tugas telah dihapus.");
                    break;
                case 5:
                    System.out.println("Keluar program.");
                    a.close();
                    return;
                default:
                    System.out.println("Yang anda pilih tidak ada di opsi, silakan pilih ulang!");    
            }
        }
    }
}
package Model;

public class Prestamo {
    private String fechInicionPrestamo;
    private int fechaFinalPrestamo;
    private int codigo;
    Student student;
    Monitor monitor;

    public Prestamo(String fechInicionPrestamo,int  fechaFinalPrestamo,int codigo,Student student,Monitor monitor) {
        this.fechInicionPrestamo = fechInicionPrestamo;
        this.fechaFinalPrestamo=fechaFinalPrestamo;
        this.codigo=codigo;
        this.student=student;
        this.monitor=monitor;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFechInicionPrestamo() {
        return fechInicionPrestamo;
    }

    public void setFechInicionPrestamo(String fechInicionPrestamo) {
        this.fechInicionPrestamo = fechInicionPrestamo;
    }

    public int getFechaFinalPrestamo() {
        return fechaFinalPrestamo;
    }

    public void setFechaFinalPrestamo(int fechaFinalPrestamo) {
        this.fechaFinalPrestamo = fechaFinalPrestamo;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}

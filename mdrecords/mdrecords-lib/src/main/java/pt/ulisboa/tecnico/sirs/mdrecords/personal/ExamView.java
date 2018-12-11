package pt.ulisboa.tecnico.sirs.mdrecords.personal;

import org.joda.time.DateTime;

public class ExamView extends RecordView {

    protected String examName;

    public ExamView() {super();}

    public ExamView(long personalId, long patientId, DateTime timeStamp, String speciality, String description) {
        super(personalId, patientId, timeStamp, speciality, description);
    }

    public ExamView(long personalId, long patientId, DateTime timeStamp, String speciality, String description, String examName) {
        super(personalId, patientId, timeStamp, speciality, description);

        this.examName = examName;
    }
}
package elementosQT;

/********************************************************************************
 ** Form generated from reading ui file 'DialogoHotelCopia.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class DialogoHotel implements com.trolltech.qt.QUiForm<QDialog>
{
    public QWidget widget;
    public QGridLayout gridLayout_5;
    public QLabel label;
    public QLabel label_14;
    public QGridLayout gridLayout_2;
    public QLabel label_6;
    public QLabel label_2;
    public QLineEdit txNombre;
    public QLabel label_3;
    public QLineEdit txApellidos;
    public QLabel label_4;
    public QLineEdit txDireccion;
    public QLabel label_5;
    public QLineEdit txTelefono;
    public QSpacerItem horizontalSpacer_3;
    public QGridLayout gridLayout_4;
    public QLabel label_9;
    public QLabel label_7;
    public QLabel label_12;
    public QDateEdit dfFechaEntrada;
    public QSpinBox spNHabitaciones;
    public QLabel label_8;
    public QCheckBox chNinnos;
    public QSpacerItem horizontalSpacer;
    public QDateEdit dfFechaSalida;
    public QGroupBox gNinnos;
    public QSpinBox spNinnos;
    public QLabel label_13;
    public QTextEdit textEdit;
    public QLabel label_10;
    public QLineEdit lineEdit;
    public QLabel label_11;
    public QComboBox comboBox;
    public QSpacerItem horizontalSpacer_4;
    public QSpacerItem verticalSpacer;
    public QGridLayout gridLayout_3;
    public QPushButton pushButton;
    public QPushButton pushButton_2;
    public QSpacerItem horizontalSpacer_2;

    public DialogoHotel() { super(); }

    public void setupUi(QDialog DialogoHotel)
    {
        DialogoHotel.setObjectName("DialogoHotel");
        DialogoHotel.resize(new QSize(789, 527).expandedTo(DialogoHotel.minimumSizeHint()));
        widget = new QWidget(DialogoHotel);
        widget.setObjectName("widget");
        widget.setGeometry(new QRect(0, 10, 777, 499));
        gridLayout_5 = new QGridLayout(widget);
        gridLayout_5.setObjectName("gridLayout_5");
        label = new QLabel(widget);
        label.setObjectName("label");
        QFont font = new QFont();
        font.setFamily("Laksaman");
        font.setPointSize(28);
        font.setBold(true);
        font.setWeight(75);
        label.setFont(font);

        gridLayout_5.addWidget(label, 0, 3, 1, 1);

        label_14 = new QLabel(widget);
        label_14.setObjectName("label_14");
        label_14.setPixmap(new QPixmap(("../../../../Im\u00e1genes/PracticaDI/miniHotel.png")));

        gridLayout_5.addWidget(label_14, 0, 5, 5, 1);

        gridLayout_2 = new QGridLayout();
        gridLayout_2.setObjectName("gridLayout_2");
        label_6 = new QLabel(widget);
        label_6.setObjectName("label_6");

        gridLayout_2.addWidget(label_6, 0, 0, 1, 2);

        label_2 = new QLabel(widget);
        label_2.setObjectName("label_2");

        gridLayout_2.addWidget(label_2, 1, 0, 1, 1);

        txNombre = new QLineEdit(widget);
        txNombre.setObjectName("txNombre");

        gridLayout_2.addWidget(txNombre, 1, 1, 1, 1);

        label_3 = new QLabel(widget);
        label_3.setObjectName("label_3");

        gridLayout_2.addWidget(label_3, 2, 0, 1, 1);

        txApellidos = new QLineEdit(widget);
        txApellidos.setObjectName("txApellidos");

        gridLayout_2.addWidget(txApellidos, 2, 1, 1, 1);

        label_4 = new QLabel(widget);
        label_4.setObjectName("label_4");

        gridLayout_2.addWidget(label_4, 3, 0, 1, 1);

        txDireccion = new QLineEdit(widget);
        txDireccion.setObjectName("txDireccion");

        gridLayout_2.addWidget(txDireccion, 3, 1, 1, 1);

        label_5 = new QLabel(widget);
        label_5.setObjectName("label_5");

        gridLayout_2.addWidget(label_5, 4, 0, 1, 1);

        txTelefono = new QLineEdit(widget);
        txTelefono.setObjectName("txTelefono");
        txTelefono.setEchoMode(com.trolltech.qt.gui.QLineEdit.EchoMode.Normal);

        gridLayout_2.addWidget(txTelefono, 4, 1, 1, 1);


        gridLayout_5.addLayout(gridLayout_2, 1, 0, 2, 2);

        horizontalSpacer_3 = new QSpacerItem(18, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_5.addItem(horizontalSpacer_3, 1, 2, 1, 1);

        gridLayout_4 = new QGridLayout();
        gridLayout_4.setObjectName("gridLayout_4");
        label_9 = new QLabel(widget);
        label_9.setObjectName("label_9");

        gridLayout_4.addWidget(label_9, 0, 0, 1, 2);

        label_7 = new QLabel(widget);
        label_7.setObjectName("label_7");

        gridLayout_4.addWidget(label_7, 1, 0, 1, 1);

        label_12 = new QLabel(widget);
        label_12.setObjectName("label_12");

        gridLayout_4.addWidget(label_12, 1, 1, 1, 2);

        dfFechaEntrada = new QDateEdit(widget);
        dfFechaEntrada.setObjectName("dfFechaEntrada");
        dfFechaEntrada.setDateTime(new QDateTime(new QDate(2000, 1, 2), new QTime(0, 0, 0)));
        dfFechaEntrada.setMaximumDateTime(new QDateTime(new QDate(7999, 12, 30), new QTime(23, 59, 59)));
        dfFechaEntrada.setCurrentSectionIndex(0);
        dfFechaEntrada.setTimeSpec(com.trolltech.qt.core.Qt.TimeSpec.LocalTime);

        gridLayout_4.addWidget(dfFechaEntrada, 2, 0, 1, 1);

        spNHabitaciones = new QSpinBox(widget);
        spNHabitaciones.setObjectName("spNHabitaciones");
        spNHabitaciones.setMinimum(1);
        spNHabitaciones.setMaximum(50);

        gridLayout_4.addWidget(spNHabitaciones, 2, 1, 1, 1);

        label_8 = new QLabel(widget);
        label_8.setObjectName("label_8");

        gridLayout_4.addWidget(label_8, 3, 0, 1, 1);

        chNinnos = new QCheckBox(widget);
        chNinnos.setObjectName("chNinnos");

        gridLayout_4.addWidget(chNinnos, 3, 1, 1, 1);

        horizontalSpacer = new QSpacerItem(58, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_4.addItem(horizontalSpacer, 3, 2, 1, 1);

        dfFechaSalida = new QDateEdit(widget);
        dfFechaSalida.setObjectName("dfFechaSalida");

        gridLayout_4.addWidget(dfFechaSalida, 4, 0, 1, 1);

        gNinnos = new QGroupBox(widget);
        gNinnos.setObjectName("gNinnos");
        spNinnos = new QSpinBox(gNinnos);
        spNinnos.setObjectName("spNinnos");
        spNinnos.setGeometry(new QRect(60, 10, 62, 32));
        spNinnos.setReadOnly(true);
        spNinnos.setMaximum(14);
        label_13 = new QLabel(gNinnos);
        label_13.setObjectName("label_13");
        label_13.setGeometry(new QRect(20, 20, 63, 20));
        textEdit = new QTextEdit(gNinnos);
        textEdit.setObjectName("textEdit");
        textEdit.setGeometry(new QRect(0, 40, 121, 111));

        gridLayout_4.addWidget(gNinnos, 4, 1, 5, 2);

        label_10 = new QLabel(widget);
        label_10.setObjectName("label_10");

        gridLayout_4.addWidget(label_10, 5, 0, 1, 1);

        lineEdit = new QLineEdit(widget);
        lineEdit.setObjectName("lineEdit");
        lineEdit.setReadOnly(true);

        gridLayout_4.addWidget(lineEdit, 6, 0, 1, 1);

        label_11 = new QLabel(widget);
        label_11.setObjectName("label_11");

        gridLayout_4.addWidget(label_11, 7, 0, 1, 1);

        comboBox = new QComboBox(widget);
        comboBox.setObjectName("comboBox");

        gridLayout_4.addWidget(comboBox, 8, 0, 1, 1);


        gridLayout_5.addLayout(gridLayout_4, 1, 3, 4, 1);

        horizontalSpacer_4 = new QSpacerItem(13, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_5.addItem(horizontalSpacer_4, 2, 4, 1, 1);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout_5.addItem(verticalSpacer, 3, 0, 1, 1);

        gridLayout_3 = new QGridLayout();
        gridLayout_3.setObjectName("gridLayout_3");
        pushButton = new QPushButton(widget);
        pushButton.setObjectName("pushButton");

        gridLayout_3.addWidget(pushButton, 0, 0, 1, 1);

        pushButton_2 = new QPushButton(widget);
        pushButton_2.setObjectName("pushButton_2");

        gridLayout_3.addWidget(pushButton_2, 1, 0, 1, 1);


        gridLayout_5.addLayout(gridLayout_3, 4, 0, 1, 1);

        horizontalSpacer_2 = new QSpacerItem(98, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_5.addItem(horizontalSpacer_2, 4, 1, 1, 1);

        retranslateUi(DialogoHotel);
        pushButton_2.clicked.connect(txNombre, "clear()");
        pushButton_2.clicked.connect(txApellidos, "clear()");
        pushButton_2.clicked.connect(txDireccion, "clear()");
        pushButton_2.clicked.connect(txTelefono, "clear()");
        pushButton_2.clicked.connect(spNHabitaciones, "clear()");
        pushButton_2.clicked.connect(dfFechaEntrada, "clear()");
        pushButton_2.clicked.connect(dfFechaSalida, "clear()");
        pushButton_2.clicked.connect(chNinnos, "setChecked(boolean)");
        chNinnos.stateChanged.connect(gNinnos, "hide()");

        DialogoHotel.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog DialogoHotel)
    {
        DialogoHotel.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "Hotel Rives", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "Hotel Rives", null));
        label_14.setText("");
        label_6.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "<html><head/><body><p><span style=\" font-size:16pt;\">Datos Personales</span></p></body></html>", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "nombre", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "Apellidos", null));
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "Direccion", null));
        label_5.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "Telefono", null));
        label_9.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "<html><head/><body><p><span style=\" font-size:16pt;\">Reservas</span></p></body></html>", null));
        label_7.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "fecha entrada", null));
        label_12.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "N\u00ba habitaciones", null));
        dfFechaEntrada.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "<html><head/><body><p>fecha de inicio de la reserva</p><p><br/></p></body></html>", null));
        label_8.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "fecha Salida", null));
        chNinnos.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "ninios", null));
        dfFechaSalida.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "<html><head/><body><p>Fecha de finalizacion de la reserva</p></body></html>", null));
        gNinnos.setTitle(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "Ni\u00f1os", null));
        label_13.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "edad", null));
        textEdit.setHtml(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\" \"http://www.w3.org/TR/REC-html40/strict.dtd\">\n"+
"<html><head><meta name=\"qrichtext\" content=\"1\" /><style type=\"text/css\">\n"+
"p, li { white-space: pre-wrap; }\n"+
"</style></head><body style=\" font-family:'Cantarell'; font-size:11pt; font-weight:400; font-style:normal;\">\n"+
"<p style=\" margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\">de 0 a 3 Cuna</p>\n"+
"<p style=\" margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\">de 4 a 10 cama supletoria</p>\n"+
"<p style=\" margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\">de 11 a 14 cama completa</p></body></html>", null));
        label_10.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "numero de dias", null));
        label_11.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "tipo de habitacion", null));
        comboBox.clear();
        comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "simple", null));
        comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "doble", null));
        comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "suite", null));
        pushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "aceptar", null));
        pushButton_2.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogoHotel", "cancelar", null));
    } // retranslateUi

}


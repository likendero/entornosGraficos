/********************************************************************************
 ** Form generated from reading ui file 'dialogocopiacopia.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package pruebaqt;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Dialogo implements com.trolltech.qt.QUiForm<QDialog>
{
    public QWidget widget;
    public QGridLayout gridLayout_7;
    public QGridLayout gridLayout_4;
    public QLabel label;
    public QLabel label_dni;
    public QLineEdit tx_dni;
    public QLabel label_2;
    public QLineEdit tx_nombre;
    public QLabel label_4;
    public QLineEdit tx_direccion;
    public QSpacerItem horizontalSpacer;
    public QLabel label_5;
    public QLineEdit tx_poblacion;
    public QLabel label_6;
    public QLineEdit tx_provincia;
    public QLabel label_3;
    public QSpacerItem horizontalSpacer_6;
    public QGridLayout gridLayout_5;
    public QLabel label_7;
    public QLabel label_8;
    public QCalendarWidget cal_llegada;
    public QCalendarWidget cal_salida;
    public QHBoxLayout horizontalLayout;
    public QLabel label_9;
    public QSpinBox spinBox;
    public QLabel label_10;
    public QComboBox comboBox;
    public QCheckBox checkBox;
    public QGridLayout gridLayout_6;
    public QGroupBox gr_tipo;
    public QWidget widget1;
    public QVBoxLayout verticalLayout_2;
    public QRadioButton rd_alodes;
    public QRadioButton rd_medpen;
    public QRadioButton rd_pcom;
    public QSpacerItem verticalSpacer;
    public QLabel label_11;
    public QSpacerItem horizontalSpacer_2;
    public QSpacerItem horizontalSpacer_3;
    public QHBoxLayout horizontalLayout_2;
    public QPushButton bt_limpiar;
    public QSpacerItem horizontalSpacer_4;
    public QPushButton bt_aceptar;
    public QSpacerItem horizontalSpacer_5;
    public QPushButton bt_salir;

    public Dialogo() { super(); }
    

void cambiar(){

//si se ha activado la casilla de verificacion mostraremos el mensaje

//la visibilidad de la etiqueta

//depende de si el checkbox está activado

label_11.setVisible(checkBox.isChecked());

}


    public void setupUi(QDialog Dialog)
    {
        Dialog.setObjectName("Dialog");
        Dialog.resize(new QSize(609, 652).expandedTo(Dialog.minimumSizeHint()));
        widget = new QWidget(Dialog);
        widget.setObjectName("widget");
        widget.setGeometry(new QRect(10, 20, 586, 624));
        gridLayout_7 = new QGridLayout(widget);
        gridLayout_7.setObjectName("gridLayout_7");
        gridLayout_4 = new QGridLayout();
        gridLayout_4.setObjectName("gridLayout_4");
        label = new QLabel(widget);
        label.setObjectName("label");
        QFont font = new QFont();
        font.setPointSize(16);
        font.setBold(true);
        font.setUnderline(true);
        font.setWeight(75);
        label.setFont(font);

        gridLayout_4.addWidget(label, 0, 0, 1, 3);

        label_dni = new QLabel(widget);
        label_dni.setObjectName("label_dni");

        gridLayout_4.addWidget(label_dni, 1, 0, 1, 1);

        tx_dni = new QLineEdit(widget);
        tx_dni.setObjectName("tx_dni");

        gridLayout_4.addWidget(tx_dni, 1, 1, 1, 2);

        label_2 = new QLabel(widget);
        label_2.setObjectName("label_2");

        gridLayout_4.addWidget(label_2, 1, 3, 1, 1);

        tx_nombre = new QLineEdit(widget);
        tx_nombre.setObjectName("tx_nombre");

        gridLayout_4.addWidget(tx_nombre, 1, 4, 1, 3);

        label_4 = new QLabel(widget);
        label_4.setObjectName("label_4");

        gridLayout_4.addWidget(label_4, 2, 0, 1, 2);

        tx_direccion = new QLineEdit(widget);
        tx_direccion.setObjectName("tx_direccion");

        gridLayout_4.addWidget(tx_direccion, 2, 2, 1, 5);

        horizontalSpacer = new QSpacerItem(38, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_4.addItem(horizontalSpacer, 3, 0, 1, 2);

        label_5 = new QLabel(widget);
        label_5.setObjectName("label_5");

        gridLayout_4.addWidget(label_5, 3, 2, 1, 1);

        tx_poblacion = new QLineEdit(widget);
        tx_poblacion.setObjectName("tx_poblacion");

        gridLayout_4.addWidget(tx_poblacion, 3, 3, 1, 2);

        label_6 = new QLabel(widget);
        label_6.setObjectName("label_6");

        gridLayout_4.addWidget(label_6, 3, 5, 1, 1);

        tx_provincia = new QLineEdit(widget);
        tx_provincia.setObjectName("tx_provincia");

        gridLayout_4.addWidget(tx_provincia, 3, 6, 1, 1);


        gridLayout_7.addLayout(gridLayout_4, 0, 0, 1, 2);

        label_3 = new QLabel(widget);
        label_3.setObjectName("label_3");

        gridLayout_7.addWidget(label_3, 1, 0, 1, 1);

        horizontalSpacer_6 = new QSpacerItem(378, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_7.addItem(horizontalSpacer_6, 1, 1, 1, 1);

        gridLayout_5 = new QGridLayout();
        gridLayout_5.setObjectName("gridLayout_5");
        label_7 = new QLabel(widget);
        label_7.setObjectName("label_7");

        gridLayout_5.addWidget(label_7, 0, 0, 1, 1);

        label_8 = new QLabel(widget);
        label_8.setObjectName("label_8");

        gridLayout_5.addWidget(label_8, 0, 1, 1, 1);

        cal_llegada = new QCalendarWidget(widget);
        cal_llegada.setObjectName("cal_llegada");

        gridLayout_5.addWidget(cal_llegada, 1, 0, 1, 1);

        cal_salida = new QCalendarWidget(widget);
        cal_salida.setObjectName("cal_salida");

        gridLayout_5.addWidget(cal_salida, 1, 1, 1, 1);


        gridLayout_7.addLayout(gridLayout_5, 2, 0, 1, 2);

        horizontalLayout = new QHBoxLayout();
        horizontalLayout.setObjectName("horizontalLayout");
        label_9 = new QLabel(widget);
        label_9.setObjectName("label_9");

        horizontalLayout.addWidget(label_9);

        spinBox = new QSpinBox(widget);
        spinBox.setObjectName("spinBox");
        spinBox.setMinimum(1);
        spinBox.setMaximum(25);

        horizontalLayout.addWidget(spinBox);

        label_10 = new QLabel(widget);
        label_10.setObjectName("label_10");

        horizontalLayout.addWidget(label_10);

        comboBox = new QComboBox(widget);
        comboBox.setObjectName("comboBox");
        comboBox.setEditable(false);

        horizontalLayout.addWidget(comboBox);

        checkBox = new QCheckBox(widget);
        checkBox.setObjectName("checkBox");

        horizontalLayout.addWidget(checkBox);


        gridLayout_7.addLayout(horizontalLayout, 3, 0, 1, 2);

        gridLayout_6 = new QGridLayout();
        gridLayout_6.setObjectName("gridLayout_6");
        gr_tipo = new QGroupBox(widget);
        gr_tipo.setObjectName("gr_tipo");
        widget1 = new QWidget(gr_tipo);
        widget1.setObjectName("widget1");
        widget1.setGeometry(new QRect(0, 10, 182, 89));
        verticalLayout_2 = new QVBoxLayout(widget1);
        verticalLayout_2.setObjectName("verticalLayout_2");
        rd_alodes = new QRadioButton(widget1);
        rd_alodes.setObjectName("rd_alodes");

        verticalLayout_2.addWidget(rd_alodes);

        rd_medpen = new QRadioButton(widget1);
        rd_medpen.setObjectName("rd_medpen");

        verticalLayout_2.addWidget(rd_medpen);

        rd_pcom = new QRadioButton(widget1);
        rd_pcom.setObjectName("rd_pcom");

        verticalLayout_2.addWidget(rd_pcom);


        gridLayout_6.addWidget(gr_tipo, 0, 0, 1, 1);

        verticalSpacer = new QSpacerItem(20, 98, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout_6.addItem(verticalSpacer, 0, 1, 1, 1);

        label_11 = new QLabel(widget);
        label_11.setObjectName("label_11");
        label_11.setWordWrap(true);

        gridLayout_6.addWidget(label_11, 0, 2, 1, 1);

        horizontalSpacer_2 = new QSpacerItem(208, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_6.addItem(horizontalSpacer_2, 1, 0, 1, 1);

        horizontalSpacer_3 = new QSpacerItem(328, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_6.addItem(horizontalSpacer_3, 1, 2, 1, 1);


        gridLayout_7.addLayout(gridLayout_6, 4, 0, 1, 2);

        horizontalLayout_2 = new QHBoxLayout();
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        bt_limpiar = new QPushButton(widget);
        bt_limpiar.setObjectName("bt_limpiar");
        bt_limpiar.setStyleSheet("background{\n"+
"rgb(170, 0, 0)\n"+
"}");

        horizontalLayout_2.addWidget(bt_limpiar);

        horizontalSpacer_4 = new QSpacerItem(258, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_2.addItem(horizontalSpacer_4);

        bt_aceptar = new QPushButton(widget);
        bt_aceptar.setObjectName("bt_aceptar");

        horizontalLayout_2.addWidget(bt_aceptar);

        horizontalSpacer_5 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_2.addItem(horizontalSpacer_5);

        bt_salir = new QPushButton(widget);
        bt_salir.setObjectName("bt_salir");

        horizontalLayout_2.addWidget(bt_salir);


        gridLayout_7.addLayout(horizontalLayout_2, 5, 0, 1, 2);

        retranslateUi(Dialog);
        bt_limpiar.clicked.connect(tx_dni, "clear()");
        bt_limpiar.clicked.connect(tx_nombre, "clear()");
        bt_limpiar.clicked.connect(tx_direccion, "clear()");
        bt_limpiar.clicked.connect(tx_poblacion, "clear()");
        bt_limpiar.clicked.connect(tx_provincia, "clear()");
        bt_limpiar.clicked.connect(spinBox, "clear()");
        bt_limpiar.clicked.connect(comboBox, "clear()");
        bt_limpiar.clicked.connect(checkBox, "setChecked(boolean)");
        bt_salir.clicked.connect(Dialog, "close()");
        bt_aceptar.clicked.connect(Dialog, "showMaximized()");
        bt_limpiar.clicked.connect(tx_dni, "setFocus()");

        comboBox.setCurrentIndex(1);

        checkBox.clicked.connect(this,"cambiar()");
        Dialog.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Dialog)
    {
        Dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Dialog", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "datos Cliente", null));
        label_dni.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" font-weight:600;\">&amp;dni</span></p></body></html>", null));
        tx_dni.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Inserte el DNI :3</p><p><br/></p></body></html>", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" font-weight:600;\">&amp;nombre</span></p></body></html>", null));
        tx_nombre.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Inserte el nombre juas juas</p><p><br/></p></body></html>", null));
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" font-weight:600;\">d&amp;ireccion</span></p></body></html>", null));
        tx_direccion.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>introduce la direccion</p></body></html>", null));
        label_5.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" font-weight:600;\">&amp;poblacion</span></p></body></html>", null));
        label_6.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" font-weight:600;\">p&amp;rovincia</span></p></body></html>", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" font-size:18pt; font-weight:600; text-decoration: underline;\">datos de reserva</span></p></body></html>", null));
        label_7.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "fecha de lelgada", null));
        label_8.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "fecha de salida", null));
        label_9.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "n&umero de habitaciones", null));
        label_10.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&tipo de habitacion", null));
        comboBox.clear();
        comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "simple", null));
        comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "doble", null));
        comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "suite", null));
        checkBox.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "fumador", null));
        gr_tipo.setTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "regimen:", null));
        rd_alodes.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "alojamineto y desayuno", null));
        rd_medpen.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "media pension", null));
        rd_pcom.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Pension Completa", null));
        label_11.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "\"En virtud de la vigente ley de sanidad solo se podra fumar en las habitaciones habilitadas para este fin\"", null));
        bt_limpiar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Limpiar", null));
        bt_aceptar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Aceptar", null));
        bt_salir.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "salir", null));
    } // retranslateUi

}


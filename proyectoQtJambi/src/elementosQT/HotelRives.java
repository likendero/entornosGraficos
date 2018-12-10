package elementosQT;

/********************************************************************************
 ** Form generated from reading ui file 'HotelRives.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class HotelRives implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QAction actionSalir;
    public QAction actionAlta;
    public QAction actionBaja;
    public QAction actionAcerca_de;
    public QWidget centralwidget;
    public QPushButton pushButton;
    public QMenuBar menubar;
    public QMenu menuArchivo;
    public QMenu menuReservas;
    public QMenu menuAyuda;
    public QStatusBar statusbar;

    public HotelRives() { super(); }

    /**
     *
     * @param HotelRives
     */
    @Override
    public void setupUi(QMainWindow HotelRives)
    {
        HotelRives.setObjectName("HotelRives");
        HotelRives.resize(new QSize(565, 386).expandedTo(HotelRives.minimumSizeHint()));
        HotelRives.setWindowIcon(new QIcon(new QPixmap("../../../../Im\u00e1genes/PracticaDI/logoIcono.png")));
        actionSalir = new QAction(HotelRives);
        actionSalir.setObjectName("actionSalir");
        actionAlta = new QAction(HotelRives);
        actionAlta.setObjectName("actionAlta");
        actionBaja = new QAction(HotelRives);
        actionBaja.setObjectName("actionBaja");
        actionAcerca_de = new QAction(HotelRives);
        actionAcerca_de.setObjectName("actionAcerca_de");
        centralwidget = new QWidget(HotelRives);
        centralwidget.setObjectName("centralwidget");
        pushButton = new QPushButton(centralwidget);
        pushButton.setObjectName("pushButton");
        pushButton.setGeometry(new QRect(220, 130, 90, 28));
        HotelRives.setCentralWidget(centralwidget);
        menubar = new QMenuBar(HotelRives);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 565, 28));
        menuArchivo = new QMenu(menubar);
        menuArchivo.setObjectName("menuArchivo");
        menuReservas = new QMenu(menubar);
        menuReservas.setObjectName("menuReservas");
        menuAyuda = new QMenu(menubar);
        menuAyuda.setObjectName("menuAyuda");
        HotelRives.setMenuBar(menubar);
        statusbar = new QStatusBar(HotelRives);
        statusbar.setObjectName("statusbar");
        HotelRives.setStatusBar(statusbar);

        menubar.addAction(menuArchivo.menuAction());
        menubar.addAction(menuReservas.menuAction());
        menubar.addAction(menuAyuda.menuAction());
        menuArchivo.addAction(actionSalir);
        menuReservas.addAction(actionAlta);
        menuReservas.addAction(actionBaja);
        menuAyuda.addAction(actionAcerca_de);
        retranslateUi(HotelRives);

        HotelRives.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow HotelRives)
    {
        HotelRives.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("HotelRives", "Hotel Rives", null));
        actionSalir.setText(com.trolltech.qt.core.QCoreApplication.translate("HotelRives", "Salir", null));
        actionAlta.setText(com.trolltech.qt.core.QCoreApplication.translate("HotelRives", "Alta", null));
        actionBaja.setText(com.trolltech.qt.core.QCoreApplication.translate("HotelRives", "baja", null));
        actionAcerca_de.setText(com.trolltech.qt.core.QCoreApplication.translate("HotelRives", "acerca de", null));
        pushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("HotelRives", "Alta", null));
        menuArchivo.setTitle(com.trolltech.qt.core.QCoreApplication.translate("HotelRives", "archivo", null));
        menuReservas.setTitle(com.trolltech.qt.core.QCoreApplication.translate("HotelRives", "reservas", null));
        menuAyuda.setTitle(com.trolltech.qt.core.QCoreApplication.translate("HotelRives", "ayuda", null));
    } // retranslateUi

}


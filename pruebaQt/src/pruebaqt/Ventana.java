/********************************************************************************
 ** Form generated from reading ui file 'ventanaPrincipal.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package pruebaqt;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ventana implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QAction actionSalir;
    public QAction actionReservas;
    public QWidget centralwidget;
    public QLabel label;
    public QPushButton btReservas;
    public QPushButton bt_salir;
    public QMenuBar menubar;
    public QMenu menuPppppppppppppppppppppppppppppppppppppppppppppppppppppp;
    public QMenu menuGestion_reservas;
    public QStatusBar statusbar;

    public Ventana() { super(); }
    

    void abrir(){

    Dialogo Alta = new Dialogo();
    QDialog dialog = new QDialog();
    // hacer modal el dialogo
    dialog.setModal(true);
    Alta.setupUi(dialog);
    dialog.show();  

    }


    public void setupUi(QMainWindow MainWindow)
    {
        MainWindow.setObjectName("MainWindow");
        MainWindow.resize(new QSize(502, 362).expandedTo(MainWindow.minimumSizeHint()));
        actionSalir = new QAction(MainWindow);
        actionSalir.setObjectName("actionSalir");
        actionReservas = new QAction(MainWindow);
        actionReservas.setObjectName("actionReservas");
        centralwidget = new QWidget(MainWindow);
        centralwidget.setObjectName("centralwidget");
        label = new QLabel(centralwidget);
        label.setObjectName("label");
        label.setGeometry(new QRect(-10, 30, 401, 271));
        label.setPixmap(new QPixmap(("src/img/imgPrin.jpg")));/////////////////////////////////////////
        label.setWordWrap(true);
        btReservas = new QPushButton(centralwidget);
        btReservas.setObjectName("btReservas");
        btReservas.setGeometry(new QRect(400, 100, 90, 28));
        bt_salir = new QPushButton(centralwidget);
        bt_salir.setObjectName("bt_salir");
        bt_salir.setGeometry(new QRect(400, 150, 90, 28));
        MainWindow.setCentralWidget(centralwidget);
        menubar = new QMenuBar(MainWindow);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 502, 28));
        menuPppppppppppppppppppppppppppppppppppppppppppppppppppppp = new QMenu(menubar);
        menuPppppppppppppppppppppppppppppppppppppppppppppppppppppp.setObjectName("menuPppppppppppppppppppppppppppppppppppppppppppppppppppppp");
        menuGestion_reservas = new QMenu(menubar);
        menuGestion_reservas.setObjectName("menuGestion_reservas");
        MainWindow.setMenuBar(menubar);
        statusbar = new QStatusBar(MainWindow);
        statusbar.setObjectName("statusbar");
        MainWindow.setStatusBar(statusbar);

        menubar.addAction(menuPppppppppppppppppppppppppppppppppppppppppppppppppppppp.menuAction());
        menubar.addAction(menuGestion_reservas.menuAction());
        menuPppppppppppppppppppppppppppppppppppppppppppppppppppppp.addAction(actionSalir);
        menuGestion_reservas.addAction(actionReservas);
        retranslateUi(MainWindow);
        bt_salir.clicked.connect(MainWindow, "close()");
        btReservas.clicked.connect(this, "abrir()");
        actionSalir.triggered.connect(MainWindow, "close()");
        actionReservas.triggered.connect(this,"abrir()");
        MainWindow.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow MainWindow)
    {
        MainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "MainWindow", null));
        actionSalir.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "salir", null));
        actionReservas.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "reservas", null));
        label.setText("");
        btReservas.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Reservas", null));
        bt_salir.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Salir", null));
        menuPppppppppppppppppppppppppppppppppppppppppppppppppppppp.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "aplicacion", null));
        menuGestion_reservas.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "gestion reservas", null));
    } // retranslateUi

}


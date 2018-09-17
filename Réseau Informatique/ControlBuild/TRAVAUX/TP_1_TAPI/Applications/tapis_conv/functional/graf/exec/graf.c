/********************************************************************
 * graf.c
 * 
 * generated by: plcgen 1.0.30
 * generation parameters:
 *  -L C:\controlbuild\tooldir\embedded\nt_simu\embedded
 *  --fl iec_1131
 *  --nl
 *  -R C:\temp\TP_1_TAPI
 *  -c
 *  tapis_conv.graf
 ********************************************************************/

#include "cb_comp.h"
#include "iec_1131.h"

#include "graf.h"


/**************************** Variables *****************************/

CB_Index graf__num = 0;
CB_Mem_Bool *graf_Fin_Convoyage;
CB_Mem_Bool *graf_Chargement;
CB_Mem_Bool *graf_Dechargement;
CB_Mem_Bool *graf_Marche;
CB_Mem_Int *graf_nb_piece;
CB_Mem_Bool *graf__X_10;
CB_Mem_Bool *graf__X_11;
CB_Mem_Bool *graf__X_20;
CB_Mem_Bool *graf__X_21;
#define COUR(v) (graf_##v->CB_current_value)
#define FIGE(v) (graf_##v->CB_previous_value)
#define RE(v) (graf_##v->CB_positive_edge)
#define FE(v) (graf_##v->CB_negative_edge)
#define _RE(v) (graf_##v->CB_current_value > graf_##v->CB_previous_value)
#define _FE(v) (graf_##v->CB_current_value < graf_##v->CB_previous_value)
#define FM(v) (graf_##v->CB_positive_edge)
#define FD(v) (graf_##v->CB_negative_edge)


/**************************** Variables *****************************/

#define Fin_Convoyage (graf_Fin_Convoyage->CB_previous_value)
#define Chargement (graf_Chargement->CB_previous_value)
#define Dechargement (graf_Dechargement->CB_previous_value)
#define Marche (graf_Marche->CB_current_value)
#define nb_piece (graf_nb_piece->CB_current_value)
#define _X_10 (graf__X_10->CB_current_value)
#define _X_11 (graf__X_11->CB_current_value)
#define _X_20 (graf__X_20->CB_current_value)
#define _X_21 (graf__X_21->CB_current_value)


/************************ Components offsets ************************/


/********************* Initialization function **********************/

int tapis_conv__graf_init(void)
{
	(self.Bool+0)->CB_current_value = 1; /*_X_10*/
	(self.Bool+2)->CB_current_value = 1; /*_X_20*/
	self.Bool+=4;
	self.Int+=1;


	return 0;
}


/************************ Behavior function *************************/

int tapis_conv__graf(void)
{
	if (exec_term_node(self_num)) {

		/*********************** Internals variables ************************/

		graf_nb_piece = self.Int+0;
		graf__X_10 = self.Bool+0;
		graf__X_11 = self.Bool+1;
		graf__X_20 = self.Bool+2;
		graf__X_21 = self.Bool+3;

		/********************* Pre-conditions execution *********************/

		/*no Pre-conditions*/

		/************************ Behavior execution ************************/

		{
			unsigned char _Y_4;
			unsigned char _Y_3;
			unsigned char _Y_10;
			unsigned char _Y_9;
			/*pre-SFC*/
			/*transitions G1*/
			_Y_4 = _X_10 && (Chargement && nb_piece < 10);
			_Y_3 = _X_11 && Fin_Convoyage;
			/*transitions G2*/
			_Y_10 = _X_20 && (Dechargement && nb_piece > 0);
			_Y_9 = _X_21 && 1;
			/*evolutions G1*/
			if (_Y_4) {
				_X_10 = 0;
			}
			if (_Y_3) {
				_X_11 = 0;
			}
			if (_Y_4) {
				_X_11 = 1;
			}
			if (_Y_3) {
				_X_10 = 1;
			}
			/*timers G1*/
			/*actions G1*/
			if (_FE(_X_11)) {
				Marche = 0;
			}
			if (_X_11) {
				Marche = 1;
				nb_piece = nb_piece + 1;
			}
			/*evolutions G2*/
			if (_Y_10) {
				_X_20 = 0;
			}
			if (_Y_9) {
				_X_21 = 0;
			}
			if (_Y_10) {
				_X_21 = 1;
			}
			if (_Y_9) {
				_X_20 = 1;
			}
			/*timers G2*/
			/*actions G2*/
			if (_X_21) {
				nb_piece = nb_piece - 1;
			}
			/*post-SFC*/
		}

		if(withoutDelay) {
			CB_freeze_bool(graf_Marche);
		}

		/******************** Post-conditions execution *********************/

		/*no Post-conditions*/
	}

	/*************************** self update ****************************/

	self.Bool += 4;
	self.Int += 1;

	return 0;
}


/********************************************************************
 * _init.c
 * 
 * generated by: plcgen 1.0.30
 * generation parameters:
 *  -L C:\controlbuild\tooldir\embedded\nt_simu\embedded
 *  --fl iec_1131
 *  --nl
 *  -R P:\RI\TP_1_TAPI
 *  tapis_conv.pc
 ********************************************************************/

#include "cb_products.h"
#include "tapis_conv/functional/graf/exec/graf.h"
#include "tapis_conv/functional/pc/exec/pc.h"

/* Low voltage specific */
int lv_iteration_step;

/* Input/output variables initialization function */
void inputOutputVariablesInit(void)
{
	pc_Fin_Convoyage = self.Bool;
	self.Bool++;
	pc_Chargement = self.Bool;
	self.Bool++;
	pc_Dechargement = self.Bool;
	self.Bool++;
	pc_Marche = self.Bool;
	self.Bool++;
}

/* Main behavior initialization function */
int behaviorsInit(void)
{
	int old_self_num = self_num;

	pc__num = self_num;
	inputOutputVariablesInit();
	tapis_conv__pc_init();
	self_num = old_self_num;
	return 0;
}

/* Main behavior function */
int behaviorsStep(void)
{
	int old_self_num = self_num;
	int __ret, i;

	lv_iteration_step = 0;
	inputOutputVariablesInit();
	pc__num = self_num;
	__ret = tapis_conv__pc();
	if (__ret != 0) {
		return __ret; /*execution failure*/
	}
	self_num = old_self_num;
	return 0;
}

/* Actors and products initialization */
T_ElementTableActeursProduits TableActeursProduits[] = {
	{{0, 0, 0, 0}, {0, 0, 0, 0},
	0, 0, 0, 0, {{0, 0}, {0, 0}}}
};
T_Instance NbActeurs = 0;
T_Instance NbProduits = 0;
T_Instance NbActeursEtProduits = 0;



/* Global variables initialization */
void globalesInit(void)
{
}

/* Memory sizes initialization */
void memorySizeInit(CB_Offset *minSize, CB_Offset *maxSize, CB_Offset *memSize)
{


	minSize->Bool = 0;
	minSize->Int = 0;
	minSize->Float = 0;
	minSize->Char = 0;

	maxSize->Bool = 13;
	maxSize->Int = 427;
	maxSize->Float = 17;
	maxSize->Char = 53;

	memSize->Bool = 13;
	memSize->Int = 427;
	memSize->Float = 17;
	memSize->Char = 53;
}


/* Location of memory starts*/
void memoryStartInit(CB_Object *pMem)
{
	extern int minBool, minInt, minFloat, minChar;

	pMem->Bool += minBool + 5;
	pMem->Int += minInt + 212;
	pMem->Float += minFloat + 7;
	pMem->Char += minChar + 53;
}

/* Initialization utils */
void CB_Bool_Init(char *Mem, int index, CB_Bool value)
{
	P_Bool(Mem, index)->CB_current_value = value;
	P_Bool(Mem, index)->CB_previous_value = value;
}

void CB_Int_Init(char *Mem, int index, CB_Int value)
{
	P_Int(Mem, index)->CB_current_value = value;
	P_Int(Mem, index)->CB_previous_value = value;
}

void CB_Float_Init(char *Mem, int index, CB_Float value)
{
	P_Float(Mem, index)->CB_current_value = value;
	P_Float(Mem, index)->CB_previous_value = value;
}

void CB_Char_Init(char *Mem, int index, CB_Char value)
{
	P_Char(Mem, index)->CB_current_value = value;
	P_Char(Mem, index)->CB_previous_value = value;
}

/* Variable initializations */
void variablesInitialization(void)
{
	char *Mem = (char *) memHeader;

	CB_Float_Init(Mem, 10, 50000.0); /*simuperiod*/
	CB_Int_Init(Mem, 211 + 0, 100); /*bpnoline size*/
	CB_Int_Init(Mem, 313 + 0, 100); /*bpnoinstance size*/
	CB_Char_Init(Mem, 0 + 1, 50); /*taskname size*/
	CB_Char_Init(Mem, 0 + 3, 'p');
	CB_Char_Init(Mem, 0 + 4, 'c');
	CB_Char_Init(Mem, 0 + 5, '.');
	CB_Char_Init(Mem, 0 + 6, 'e');
	CB_Char_Init(Mem, 0 + 7, 'x');
	CB_Char_Init(Mem, 0 + 8, 'e');
	CB_Bool_Init(Mem, 3, 1); /*allowpreconditions*/
	CB_Bool_Init(Mem, 4, 1); /*allowpostconditions*/
}

/* Control Variables access */
void controlVariablesAccessInitialization(void)
{
	char *Mem = (char *) memHeader;
	extern CB_Mem_Bool *traceon;
	extern CB_Mem_Bool *resettrace;
	extern CB_Mem_Bool *cb_delay;
	extern CB_Mem_Bool *allowpreconditions;
	extern CB_Mem_Bool *allowpostconditions;
	extern CB_Mem_Int *execstatus;
	extern CB_Mem_Int *bpnoline;
	extern CB_Mem_Int *bpnoinstance;
	extern CB_Mem_Int *bpcurrentinstance;
	extern CB_Mem_Int *bpcurrentlocation;
	extern CB_Mem_Int *bpcurrentprepostcode;
	extern CB_Mem_Int *bpcurrenttypeerror;
	extern CB_Mem_Int *bpcurrentrank;
	extern CB_Mem_Int *signature;
	extern CB_Mem_Int *generationtime;
	extern CB_Mem_Float *simuperiod;
	extern CB_Mem_Float *maxsimuperiod;
	extern CB_Mem_Float *minsimuperiod;
	extern CB_Mem_Float *realsimuperiod;
	extern CB_Mem_Float *mxmeanvariablemodification;
	extern CB_Mem_Float *mxminvariablemodification;
	extern CB_Mem_Float *mxmaxvariablemodification;
	extern CB_Mem_Char *taskname;

	execstatus = P_Int(Mem, 210);
	simuperiod = P_Float(Mem, 10);
	minsimuperiod = P_Float(Mem, 11);
	maxsimuperiod = P_Float(Mem, 12);
	realsimuperiod = P_Float(Mem, 13);
	bpnoline = P_Int(Mem, 211);
	bpnoinstance = P_Int(Mem, 313);
	bpcurrentinstance = P_Int(Mem, 415);
	bpcurrentlocation = P_Int(Mem, 416);
	bpcurrentprepostcode = P_Int(Mem, 417);
	bpcurrenttypeerror = P_Int(Mem, 418);
	bpcurrentrank = P_Int(Mem, 419);
	signature = P_Int(Mem, 420);
	generationtime = P_Int(Mem, 421);
	taskname = P_Char(Mem, 0);
	traceon = P_Bool(Mem, 0);
	resettrace = P_Bool(Mem, 1);
	cb_delay = P_Bool(Mem, 2);
	mxmeanvariablemodification = P_Float(Mem, 14);
	mxminvariablemodification = P_Float(Mem, 15);
	mxmaxvariablemodification = P_Float(Mem, 16);
	allowpreconditions = P_Bool(Mem, 3);
	allowpostconditions = P_Bool(Mem, 4);
}

/* Time cycle initialization */
void timeCycleInitialization(CB_Mem_Float *timecycle)
{
	timecycle->CB_current_value = 50000.0;
}

/* Starting mode */
void initStartingMode(CB_Mem_Int *execstatus)
{
	execstatus->CB_current_value = mx_exec_status_stop;
}

/* Execution mode */
void initExecutionMode(CB_Mem_Bool *delay)
{
	delay->CB_current_value = 0;
}


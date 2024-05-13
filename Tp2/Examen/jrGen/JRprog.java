/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRprog
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_Clientela_intTovoid;
	public Cap_ext_ JRget_op_Clientela_intTovoid() {
		return op_Clientela_intTovoid;
	}
	public void JRset_op_Clientela_intTovoid(Cap_ext_ op_Clientela_intTovoid) {
		this.op_Clientela_intTovoid = op_Clientela_intTovoid;
	}

	public Cap_ext_ op_Barberia_intTovoid;
	public Cap_ext_ JRget_op_Barberia_intTovoid() {
		return op_Barberia_intTovoid;
	}
	public void JRset_op_Barberia_intTovoid(Cap_ext_ op_Barberia_intTovoid) {
		this.op_Barberia_intTovoid = op_Barberia_intTovoid;
	}

	public Cap_ext_ op_mutex_voidTovoid;
	public Cap_ext_ JRget_op_mutex_voidTovoid() {
		return op_mutex_voidTovoid;
	}
	public void JRset_op_mutex_voidTovoid(Cap_ext_ op_mutex_voidTovoid) {
		this.op_mutex_voidTovoid = op_mutex_voidTovoid;
	}

	public Cap_ext_ op_listo_voidTovoid;
	public Cap_ext_ JRget_op_listo_voidTovoid() {
		return op_listo_voidTovoid;
	}
	public void JRset_op_listo_voidTovoid(Cap_ext_ op_listo_voidTovoid) {
		this.op_listo_voidTovoid = op_listo_voidTovoid;
	}

	public Cap_ext_ op_corteterminado_voidTovoid;
	public Cap_ext_ JRget_op_corteterminado_voidTovoid() {
		return op_corteterminado_voidTovoid;
	}
	public void JRset_op_corteterminado_voidTovoid(Cap_ext_ op_corteterminado_voidTovoid) {
		this.op_corteterminado_voidTovoid = op_corteterminado_voidTovoid;
	}

	public Cap_ext_ op_mutexB_voidTovoid;
	public Cap_ext_ JRget_op_mutexB_voidTovoid() {
		return op_mutexB_voidTovoid;
	}
	public void JRset_op_mutexB_voidTovoid(Cap_ext_ op_mutexB_voidTovoid) {
		this.op_mutexB_voidTovoid = op_mutexB_voidTovoid;
	}

	public Cap_ext_ op_mutexC_voidTovoid;
	public Cap_ext_ JRget_op_mutexC_voidTovoid() {
		return op_mutexC_voidTovoid;
	}
	public void JRset_op_mutexC_voidTovoid(Cap_ext_ op_mutexC_voidTovoid) {
		this.op_mutexC_voidTovoid = op_mutexC_voidTovoid;
	}

	public Cap_ext_ op_espera_voidTovoid;
	public Cap_ext_ JRget_op_espera_voidTovoid() {
		return op_espera_voidTovoid;
	}
	public void JRset_op_espera_voidTovoid(Cap_ext_ op_espera_voidTovoid) {
		this.op_espera_voidTovoid = op_espera_voidTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_Clientela_intTovoid = copy.op_Clientela_intTovoid;
	this.op_Barberia_intTovoid = copy.op_Barberia_intTovoid;
	this.op_mutex_voidTovoid = copy.op_mutex_voidTovoid;
	this.op_listo_voidTovoid = copy.op_listo_voidTovoid;
	this.op_corteterminado_voidTovoid = copy.op_corteterminado_voidTovoid;
	this.op_mutexB_voidTovoid = copy.op_mutexB_voidTovoid;
	this.op_mutexC_voidTovoid = copy.op_mutexC_voidTovoid;
	this.op_espera_voidTovoid = copy.op_espera_voidTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_Clientela_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_Barberia_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_mutex_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_listo_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_corteterminado_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_mutexB_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);
	this.op_mutexC_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[6]);
	this.op_espera_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[7]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_Clientela_intTovoid = Cap_ext_.noop;
	this.op_Barberia_intTovoid = Cap_ext_.noop;
	this.op_mutex_voidTovoid = Cap_ext_.noop;
	this.op_listo_voidTovoid = Cap_ext_.noop;
	this.op_corteterminado_voidTovoid = Cap_ext_.noop;
	this.op_mutexB_voidTovoid = Cap_ext_.noop;
	this.op_mutexC_voidTovoid = Cap_ext_.noop;
	this.op_espera_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRprog(true);
	}
    }

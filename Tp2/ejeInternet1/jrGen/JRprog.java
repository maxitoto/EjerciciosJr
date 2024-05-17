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
	public Cap_ext_ op_RobotsEnsambladores_intTovoid;
	public Cap_ext_ JRget_op_RobotsEnsambladores_intTovoid() {
		return op_RobotsEnsambladores_intTovoid;
	}
	public void JRset_op_RobotsEnsambladores_intTovoid(Cap_ext_ op_RobotsEnsambladores_intTovoid) {
		this.op_RobotsEnsambladores_intTovoid = op_RobotsEnsambladores_intTovoid;
	}

	public Cap_ext_ op_RColocador_voidTovoid;
	public Cap_ext_ JRget_op_RColocador_voidTovoid() {
		return op_RColocador_voidTovoid;
	}
	public void JRset_op_RColocador_voidTovoid(Cap_ext_ op_RColocador_voidTovoid) {
		this.op_RColocador_voidTovoid = op_RColocador_voidTovoid;
	}

	public Cap_ext_ op_espera_intTovoid;
	public Cap_ext_ JRget_op_espera_intTovoid() {
		return op_espera_intTovoid;
	}
	public void JRset_op_espera_intTovoid(Cap_ext_ op_espera_intTovoid) {
		this.op_espera_intTovoid = op_espera_intTovoid;
	}

	public Cap_ext_ op_mutex_voidTovoid;
	public Cap_ext_ JRget_op_mutex_voidTovoid() {
		return op_mutex_voidTovoid;
	}
	public void JRset_op_mutex_voidTovoid(Cap_ext_ op_mutex_voidTovoid) {
		this.op_mutex_voidTovoid = op_mutex_voidTovoid;
	}

	public Cap_ext_ op_lineaLibre_voidTovoid;
	public Cap_ext_ JRget_op_lineaLibre_voidTovoid() {
		return op_lineaLibre_voidTovoid;
	}
	public void JRset_op_lineaLibre_voidTovoid(Cap_ext_ op_lineaLibre_voidTovoid) {
		this.op_lineaLibre_voidTovoid = op_lineaLibre_voidTovoid;
	}

	public JRprog(JRprog copy)
	{
	this.op_RobotsEnsambladores_intTovoid = copy.op_RobotsEnsambladores_intTovoid;
	this.op_RColocador_voidTovoid = copy.op_RColocador_voidTovoid;
	this.op_espera_intTovoid = copy.op_espera_intTovoid;
	this.op_mutex_voidTovoid = copy.op_mutex_voidTovoid;
	this.op_lineaLibre_voidTovoid = copy.op_lineaLibre_voidTovoid;

	}
	public JRprog(Object ... opSig)
	{
	this.op_RobotsEnsambladores_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_RColocador_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_espera_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_mutex_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_lineaLibre_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);

	}
	public JRprog(boolean dummy)	{
	    super(dummy);
	this.op_RobotsEnsambladores_intTovoid = Cap_ext_.noop;
	this.op_RColocador_voidTovoid = Cap_ext_.noop;
	this.op_espera_intTovoid = Cap_ext_.noop;
	this.op_mutex_voidTovoid = Cap_ext_.noop;
	this.op_lineaLibre_voidTovoid = Cap_ext_.noop;

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

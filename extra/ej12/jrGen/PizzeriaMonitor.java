/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


class PizzeriaMonitor extends java.lang.Object {
    { JRinit(); }
    Op_ext.JRProxyOp JRget_op_m_mutex_voidTovoid()
    {
        return op_m_mutex_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_m_mutex_voidTovoid;
    
    Op_ext.JRProxyOp JRget_op_m_urgentq_voidTovoid()
    {
        return op_m_urgentq_voidTovoid;
    }
    
    public Op_ext.JRProxyOp op_m_urgentq_voidTovoid;
    
    int m_n_urgentq = 0;
    String m_name;
    
    public PizzeriaMonitor(String n) {
        // Begin Expr2
        super();
        // Begin Expr2
        this.m_name = n;
        JRprocess();
    }
    
    private void m_next() {
        if (m_n_urgentq > 0) {
            // Begin Expr2
            m_n_urgentq--;
            op_m_urgentq_voidTovoid.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
        } else {
            op_m_mutex_voidTovoid.send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler)null, (java.lang.Object [])null);
        }
    }
    private boolean hay_queso = false;
    private boolean hay_salsa = false;
    private boolean hay_morron = false;
    private m_condvar queso_listo = new m_condvar("queso_listo");
    private m_condvar queso = new m_condvar("queso");
    private m_condvar salsa_lista = new m_condvar("salsa_lista");
    private m_condvar salsa = new m_condvar("salsa");
    private m_condvar morron_listo = new m_condvar("morron_listo");
    private m_condvar morron = new m_condvar("morron");
    
    public void preparar_ingrediente(String ingrediente) {
        Op_ext.JRProxyOp op_m_return_from_wait_voidTovoid = null;
        try{
            op_m_return_from_wait_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError("Cannot initialize op"); }
        
        
        {
            jrvm.sendAndDie();
            Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
            jrvm.ariseAndReceive();
            if (recv_voidTovoid.retOp != null)
                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
        }
        if (ingrediente == "queso") {
            // Begin Expr2
            hay_queso = true;
            {
                // Begin Expr2
                m_n_urgentq++;
                if (((Boolean) (new Cap_ext_((queso_listo).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_voidTovoid = op_m_urgentq_voidTovoid.recv();
                        jrvm.ariseAndReceive();
                        if (recv_voidTovoid.retOp != null)
                            recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                } else {
                    // Begin Expr2
                    m_n_urgentq--;
                }
            }
            {
                m_condvar m_cv = (queso);
                m_cv.JRget_op_m_wait_Cap_voidTovoidXintTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(op_m_return_from_wait_voidTovoid), 0});
                m_cv.JRget_op_m_wait_ranks_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {0});
                // Begin Expr2
                m_next();
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = op_m_return_from_wait_voidTovoid.recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
            }
        } else if (ingrediente == "salsa") {
            // Begin Expr2
            hay_salsa = true;
            {
                // Begin Expr2
                m_n_urgentq++;
                if (((Boolean) (new Cap_ext_((salsa_lista).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_voidTovoid = op_m_urgentq_voidTovoid.recv();
                        jrvm.ariseAndReceive();
                        if (recv_voidTovoid.retOp != null)
                            recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                } else {
                    // Begin Expr2
                    m_n_urgentq--;
                }
            }
            {
                m_condvar m_cv = (salsa);
                m_cv.JRget_op_m_wait_Cap_voidTovoidXintTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(op_m_return_from_wait_voidTovoid), 0});
                m_cv.JRget_op_m_wait_ranks_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {0});
                // Begin Expr2
                m_next();
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = op_m_return_from_wait_voidTovoid.recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
            }
        } else {
            // Begin Expr2
            hay_morron = true;
            {
                // Begin Expr2
                m_n_urgentq++;
                if (((Boolean) (new Cap_ext_((morron_listo).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_voidTovoid = op_m_urgentq_voidTovoid.recv();
                        jrvm.ariseAndReceive();
                        if (recv_voidTovoid.retOp != null)
                            recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                } else {
                    // Begin Expr2
                    m_n_urgentq--;
                }
            }
            {
                m_condvar m_cv = (morron);
                m_cv.JRget_op_m_wait_Cap_voidTovoidXintTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(op_m_return_from_wait_voidTovoid), 0});
                m_cv.JRget_op_m_wait_ranks_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {0});
                // Begin Expr2
                m_next();
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = op_m_return_from_wait_voidTovoid.recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
            }
        }
        // Begin Expr2
        m_next();
    }
    
    public void solicitar_ingrediente(String ingrediente) {
        Op_ext.JRProxyOp op_m_return_from_wait_voidTovoid = null;
        try{
            op_m_return_from_wait_voidTovoid = new Op_ext_.JRProxyOp(new InOp_ext_impl());
        } catch (Exception e) { throw new jrRuntimeError("Cannot initialize op"); }
        
        
        {
            jrvm.sendAndDie();
            Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
            jrvm.ariseAndReceive();
            if (recv_voidTovoid.retOp != null)
                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
        }
        if (ingrediente == "queso") {
            if (hay_queso) {
                // Begin Expr2
                hay_queso = false;
                {
                    // Begin Expr2
                    m_n_urgentq++;
                    if (((Boolean) (new Cap_ext_((queso).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                        {
                            jrvm.sendAndDie();
                            Recv_ext recv_voidTovoid = op_m_urgentq_voidTovoid.recv();
                            jrvm.ariseAndReceive();
                            if (recv_voidTovoid.retOp != null)
                                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                        }
                    } else {
                        // Begin Expr2
                        m_n_urgentq--;
                    }
                }
            } else {
                {
                    m_condvar m_cv = (queso_listo);
                    m_cv.JRget_op_m_wait_Cap_voidTovoidXintTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(op_m_return_from_wait_voidTovoid), 0});
                    m_cv.JRget_op_m_wait_ranks_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {0});
                    // Begin Expr2
                    m_next();
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_voidTovoid = op_m_return_from_wait_voidTovoid.recv();
                        jrvm.ariseAndReceive();
                        if (recv_voidTovoid.retOp != null)
                            recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                }
                // Begin Expr2
                hay_queso = false;
                {
                    // Begin Expr2
                    m_n_urgentq++;
                    if (((Boolean) (new Cap_ext_((queso).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                        {
                            jrvm.sendAndDie();
                            Recv_ext recv_voidTovoid = op_m_urgentq_voidTovoid.recv();
                            jrvm.ariseAndReceive();
                            if (recv_voidTovoid.retOp != null)
                                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                        }
                    } else {
                        // Begin Expr2
                        m_n_urgentq--;
                    }
                }
            }
        } else if (ingrediente == "salsa") {
            if (hay_salsa) {
                // Begin Expr2
                hay_salsa = false;
                {
                    // Begin Expr2
                    m_n_urgentq++;
                    if (((Boolean) (new Cap_ext_((salsa).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                        {
                            jrvm.sendAndDie();
                            Recv_ext recv_voidTovoid = op_m_urgentq_voidTovoid.recv();
                            jrvm.ariseAndReceive();
                            if (recv_voidTovoid.retOp != null)
                                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                        }
                    } else {
                        // Begin Expr2
                        m_n_urgentq--;
                    }
                }
            } else {
                {
                    m_condvar m_cv = (salsa_lista);
                    m_cv.JRget_op_m_wait_Cap_voidTovoidXintTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(op_m_return_from_wait_voidTovoid), 0});
                    m_cv.JRget_op_m_wait_ranks_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {0});
                    // Begin Expr2
                    m_next();
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_voidTovoid = op_m_return_from_wait_voidTovoid.recv();
                        jrvm.ariseAndReceive();
                        if (recv_voidTovoid.retOp != null)
                            recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                }
                // Begin Expr2
                hay_salsa = false;
                {
                    // Begin Expr2
                    m_n_urgentq++;
                    if (((Boolean) (new Cap_ext_((salsa).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                        {
                            jrvm.sendAndDie();
                            Recv_ext recv_voidTovoid = op_m_urgentq_voidTovoid.recv();
                            jrvm.ariseAndReceive();
                            if (recv_voidTovoid.retOp != null)
                                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                        }
                    } else {
                        // Begin Expr2
                        m_n_urgentq--;
                    }
                }
            }
        } else {
            if (hay_morron) {
                // Begin Expr2
                hay_morron = false;
                {
                    // Begin Expr2
                    m_n_urgentq++;
                    if (((Boolean) (new Cap_ext_((morron).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                        {
                            jrvm.sendAndDie();
                            Recv_ext recv_voidTovoid = op_m_urgentq_voidTovoid.recv();
                            jrvm.ariseAndReceive();
                            if (recv_voidTovoid.retOp != null)
                                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                        }
                    } else {
                        // Begin Expr2
                        m_n_urgentq--;
                    }
                }
            } else {
                {
                    m_condvar m_cv = (morron_listo);
                    m_cv.JRget_op_m_wait_Cap_voidTovoidXintTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {new Cap_ext_(op_m_return_from_wait_voidTovoid), 0});
                    m_cv.JRget_op_m_wait_ranks_intTovoid().send(jrvm.getTimestamp(), (edu.ucdavis.jr.RemoteHandler) null, new java.lang.Object [] {0});
                    // Begin Expr2
                    m_next();
                    {
                        jrvm.sendAndDie();
                        Recv_ext recv_voidTovoid = op_m_return_from_wait_voidTovoid.recv();
                        jrvm.ariseAndReceive();
                        if (recv_voidTovoid.retOp != null)
                            recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                    }
                }
                // Begin Expr2
                hay_morron = false;
                {
                    // Begin Expr2
                    m_n_urgentq++;
                    if (((Boolean) (new Cap_ext_((morron).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null))) {
                        {
                            jrvm.sendAndDie();
                            Recv_ext recv_voidTovoid = op_m_urgentq_voidTovoid.recv();
                            jrvm.ariseAndReceive();
                            if (recv_voidTovoid.retOp != null)
                                recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                        }
                    } else {
                        // Begin Expr2
                        m_n_urgentq--;
                    }
                }
            }
        }
        // Begin Expr2
        m_next();
    }
    protected boolean JRcalled = false;
    protected JRPizzeriaMonitor jrresref;
    public Object JRgetjrresref()
    { try {return jrresref.clone(); } catch (Exception e) {/* not gonna happen */ return null; } }
    protected void JRinit() {
    	if(this.JRcalled) return;
    	try {
    	op_m_urgentq_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	{
     	  long JRTotal = 0;
    	  if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
    	    for (long JRiter = 0; JRiter < JRTotal; JRiter++)
    	      op_m_urgentq_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
    	}
    	op_m_mutex_voidTovoid = 
    	  new Op_ext_.JRProxyOp(new InOp_ext_impl());
    	{
     	  long JRTotal = 1;
    	  if (JRTotal < 0) throw new jrRuntimeError("op initialized with a negative value");
    	    for (long JRiter = 0; JRiter < JRTotal; JRiter++)
    	      op_m_mutex_voidTovoid.send(jrvm.getTimestamp(), (java.lang.Object []) null);
    	}
    	} catch (Exception JRe)
    	{ throw new jrRuntimeError(JRe.toString()); }
    	jrresref = new JRPizzeriaMonitor(op_m_urgentq_voidTovoid, op_m_mutex_voidTovoid);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}

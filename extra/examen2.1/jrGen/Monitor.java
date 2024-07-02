/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;


class Monitor extends java.lang.Object {
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
    
    public Monitor(String n) {
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
    static boolean[] consultorios = {true, true, true};
    private int pacientesEsperando = 0;
    private boolean noMeLlamen = true;
    private boolean noAsignenPaciente = true;
    private m_condvar hayaclientesOconsultorioDisponible = new m_condvar("hayaclientesOconsultorioDisponible");
    private m_condvar serLlamado = new m_condvar("serLlamado");
    private m_condvar serAtendido = new m_condvar("serAtendido");
    private m_condvar asignenPaciente = new m_condvar("asignenPaciente");
    
    public void formarse() {
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
        // Begin Expr2
        pacientesEsperando++;
        JRLoop4: while (noMeLlamen) {
            // Begin Expr2
            System.out.println("Cliente esperando");
            {
                m_condvar m_cv = (serLlamado);
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
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
            }
        }
        // Begin Expr2
        pacientesEsperando--;
        // Begin Expr2
        m_next();
    }
    
    public int asignarPacienteAConsultorio() {
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
        boolean consultorioNoDiponible = true;
        int numeroConsultorioDiponible = -1;
        JRLoop5: for (int i = 0; i < 3; i++) {
            if (consultorios[i]) {
                // Begin Expr2
                consultorioNoDiponible = true;
                // Begin Expr2
                numeroConsultorioDiponible = i;
                break JRLoop5;
            } else {
                // Begin Expr2
                consultorioNoDiponible = false;
                // Begin Expr2
                numeroConsultorioDiponible = -1;
            }
        }
        JRLoop7: while (pacientesEsperando == 0 || consultorioNoDiponible) {
            {
                m_condvar m_cv = (hayaclientesOconsultorioDisponible);
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
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
            }
            JRLoop6: for (int i = 0; i < 3; i++) {
                if (consultorios[i]) {
                    // Begin Expr2
                    consultorioNoDiponible = true;
                    // Begin Expr2
                    numeroConsultorioDiponible = i;
                    break JRLoop6;
                } else {
                    // Begin Expr2
                    consultorioNoDiponible = false;
                    // Begin Expr2
                    numeroConsultorioDiponible = -1;
                }
            }
        }
        // Begin Expr2
        System.out.println("le asigno a un cliente formado, un consultorio medico");
        // Begin Expr2
        consultorios[numeroConsultorioDiponible] = false;
        // Begin Expr2
        (new Cap_ext_((serLlamado).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null);
        // Begin Expr2
        noAsignenPaciente = false;
        // Begin Expr2
        (new Cap_ext_((asignenPaciente).JRget_op_m_signal_voidToboolean(), "boolean")).call(jrvm.getTimestamp(), (java.lang.Object[]) null);
        {
            if (true) {
                // Begin Expr2
                m_next();
                // Return
                return (numeroConsultorioDiponible);
                // End Return

            }
        }
        // Begin Expr2
        m_next();
        throw new RuntimeException("reached end of non-void _proc (Monitor.m, line 63) without executing a return");
    }
    
    public void atender() {
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
        JRLoop8: while (noAsignenPaciente) {
            {
                m_condvar m_cv = (asignenPaciente);
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
                {
                    jrvm.sendAndDie();
                    Recv_ext recv_voidTovoid = op_m_mutex_voidTovoid.recv();
                    jrvm.ariseAndReceive();
                    if (recv_voidTovoid.retOp != null)
                        recv_voidTovoid.retOp.send(jrvm.getTimestamp(), (java.lang.Object[]) null);
                }
            }
        }
        // Begin Expr2
        m_next();
    }
    
    public void liberarConsultorio(int consultorio) {
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
        // Begin Expr2
        consultorios[consultorio] = true;
        // Begin Expr2
        m_next();
    }
    protected boolean JRcalled = false;
    protected JRMonitor jrresref;
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
    	jrresref = new JRMonitor(op_m_urgentq_voidTovoid, op_m_mutex_voidTovoid);
    	this.JRcalled = true;
    }
    private boolean JRproc = false;
    private void JRprocess() {
    	if (JRproc) return;
    	JRproc = true;
    }
}

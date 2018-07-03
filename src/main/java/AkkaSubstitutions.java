import com.oracle.svm.core.annotate.RecomputeFieldValue.*;
import com.oracle.svm.core.annotate.*;

@TargetClass(className = "akka.actor.LightArrayRevolverScheduler$")
final class Target_akka_actor_LightArrayRevolverScheduler$ {
  @Alias @RecomputeFieldValue(kind = Kind.FieldOffset, //
          declClassName = "akka.actor.LightArrayRevolverScheduler$TaskHolder", //
          name = "task")
  public final long akka$actor$LightArrayRevolverScheduler$$taskOffset = 0L;
}

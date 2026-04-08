package cn.alex.dubbo.consumer.filter;

import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;

@Activate(group = CommonConstants.CONSUMER, order = 1)
public class ConsumerFilter implements Filter {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) {
        RpcContext context = RpcContext.getContext();
        if (context != null) {
            context.setAttachment("context", "money");
        }
        return invoker.invoke(invocation);
    }

}
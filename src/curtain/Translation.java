package curtain;

import curtain.analysis.*;
import curtain.node.*;

public class Translation extends DepthFirstAdapter
{

    public void caseANumeroTerm(TNumero node)
    {
        System.out.println(node);
    }

    @Override public void outASomaExpr(ASomaExpr node)
    {
        System.out.println(node.getSoma());
    }

    @Override public void outAMenosExpr(AMenosExpr node)
    {
        System.out.println(node.getMenos());
    }

    @Override public void outAMultFactor(AMultFactor node)
    {
        System.out.println(node.getMult());
    }

    @Override public void outADivFactor(ADivFactor node)
    {
        System.out.println(node.getDiv());
    }

    @Override public void outAModFactor(AModFactor node)
    {
        System.out.println(node.getMod());
    }

}
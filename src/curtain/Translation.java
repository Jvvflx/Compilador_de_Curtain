package curtain;

import curtain.analysis.*;
import curtain.node.*;

public class Translation extends DepthFirstAdapter
{

    @Override public void caseANumeroTerm(ANumeroTerm node)
    {
        System.out.println(node.getCharDec());
    }

    @Override public void outASomaExpr(ASomaExpr node)
    {
        System.out.println(node.getMais());
    }

    @Override public void outASubtracaoExpr(ASubtracaoExpr node)
    {
        System.out.println(node.getMenos());
    }

    @Override public void outAMultiplicacaoFactor(AMultiplicacaoFactor node)
    {
        System.out.println(node.getEstrela());
    }

    @Override public void outADivisaoFactor(ADivisaoFactor node)
    {
        System.out.println(node.getSlash());
    }

    @Override public void outAModuloFactor(AModuloFactor node)
    {
        System.out.println(node.getMod());
    }

    @Override public void outADivisaointFactor(ADivisaointFactor node)
    {
        System.out.println(node.getSSlash());
    }

}
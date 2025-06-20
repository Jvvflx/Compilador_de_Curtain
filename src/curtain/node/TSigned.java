/* This file was generated by SableCC (http://www.sablecc.org/). */

package curtain.node;

import curtain.analysis.*;

@SuppressWarnings("nls")
public final class TSigned extends Token
{
    public TSigned()
    {
        super.setText("signed");
    }

    public TSigned(int line, int pos)
    {
        super.setText("signed");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSigned(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSigned(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSigned text.");
    }
}

package com.jxls.writer.command;

import com.jxls.writer.*;

/**
 * Date: Mar 13, 2009
 *
 * @author Leonid Vysochyn
 */
public interface Command {

    Size getInitialSize();

    Size applyAt(Cell cell, Context context);

    Size getSize(Context context);

}
package ru.forinnyy.tm.command.task;

import ru.forinnyy.tm.exception.entity.AbstractEntityException;
import ru.forinnyy.tm.exception.field.AbstractFieldException;
import ru.forinnyy.tm.exception.user.AbstractUserException;

public final class TaskClearCommand extends AbstractTaskCommand {

    private static final String NAME = "task-clear";

    private static final String DESCRIPTION = "Clear all tasks.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void execute() throws AbstractEntityException, AbstractFieldException, AbstractUserException {
        System.out.println("[CLEAR TASKS]");
        final String userId = getUserId();
        getTaskService().clear(userId);
    }

}

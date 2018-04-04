package seedu.address.logic.commands;

import seedu.address.model.person.Category;

/**
 *Sort the selected list according to their subject in alphabetical order
 */
public class SortBySubjectCommand extends SortCommand {

    public static final String MESSAGE_SORT_DESC = " their subject in alphabetical order.";

    private Category category;


    public SortBySubjectCommand(Category category) {
        this.category = category;
    }

    @Override
    public CommandResult execute() {
        switch (category.toString()) {

        case COMMAND_WORD_TUTOR:
            model.sortBySubjectFilteredClientTutorList();
            return new CommandResult(MESSAGE_SUCCESS_TUTOR + MESSAGE_SORT_DESC);

        case COMMAND_WORD_STUDENT:
            model.sortBySubjectFilteredClientStudentList();
            return new CommandResult(MESSAGE_SUCCESS_STUDENT + MESSAGE_SORT_DESC);

        default:
            return new CommandResult(MESSAGE_FAILURE);
        }
    }
}
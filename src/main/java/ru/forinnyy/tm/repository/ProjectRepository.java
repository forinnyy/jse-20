package ru.forinnyy.tm.repository;

import ru.forinnyy.tm.api.repository.IProjectRepository;
import ru.forinnyy.tm.model.Project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class ProjectRepository extends AbstractUserOwnedRepository<Project>
        implements IProjectRepository {

    @Override
    public Project create(final String userId, final String name) {
        final Project project = new Project();
        project.setName(name);
        project.setUserId(userId);
        return add(userId, project);
    }

    @Override
    public Project create(final String userId, final String name, final String description) {
        final Project project = new Project();
        project.setName(name);
        project.setDescription(description);
        return add(userId, project);
    }

}

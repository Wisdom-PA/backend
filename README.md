# Backend – Optional cloud/sync services

Java backend for optional features (e.g. remote backup API). Not required for v1 core; add when needed.

- **Plan and tickets:** See Wisdom root (Plan.md, GettingStarted.md, Tickets.md).
- **API contract:** Define any app ↔ backend or cube ↔ backend APIs in the [contracts](https://github.com/Wisdom-PA/contracts) repo or here.

## Lint

- Run: `.\mvnw.cmd verify` (Windows) or `./mvnw verify` (Git Bash).
- This repo uses Checkstyle via `maven-checkstyle-plugin` with `checkstyle.xml`.

Phase 4 (optional): scaffold, test config, implement only what v1 needs.

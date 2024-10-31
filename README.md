# ResBook - Resource Booking System

## Описание проекта
**ResBook** — это приложение для бронирования ресурсов, которое позволяет пользователям создавать, управлять и отменять бронирования для различных ресурсов, таких как залы для встреч, помещения или оборудование. Приложение также отправляет уведомления о статусах бронирований и предоставляет отчёты, которые можно экспортировать в формате JSON и XML.

## Функциональные возможности
- **Управление бронированиями**: создание, редактирование, просмотр и отмена бронирований.
- **Проверка доступности ресурсов**: предотвращение пересечений бронирований.
- **Уведомления по email**: рассылка уведомлений о статусах бронирований.
- **Отчёты**: генерация отчетов о бронированиях с экспортом данных в формате JSON/XML.
- **Аутентификация и авторизация**: поддержка JWT-токенов для управления доступом пользователей.
- **Контейнеризация**: запуск приложения и базы данных через Docker.

## Технологии
- **Java** — основной язык разработки.
- **PostgreSQL** — база данных для хранения пользователей, ресурсов и бронирований.
- **Docker** — контейнеризация приложения и базы данных для упрощения развертывания.

- **JSON и XML** — форматы данных для экспорта отчетов.
- **Java Mail API** — для отправки email-уведомлений.

## Установка и настройка
### 1. Предварительные требования
- Установленные `Docker` и `docker-compose`.
- Установленный `Java JDK 11+`.
- PostgreSQL (локально или через Docker).

### 2. Запуск проекта
1. Клонируйте репозиторий:
   ```bash
   git clone https://github.com/username/resbook.git
